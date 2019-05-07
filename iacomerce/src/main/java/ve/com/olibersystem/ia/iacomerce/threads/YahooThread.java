package ve.com.olibersystem.ia.iacomerce.threads;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ve.com.olibersystem.ia.iacomerce.model.InstrumentYahoo;
import ve.com.olibersystem.ia.iacomerce.model.etoro.Rate;
import ve.com.olibersystem.ia.iacomerce.model.etoro.WebDataTimer;
import ve.com.olibersystem.ia.iacomerce.utils.ManejoArchivos;
import ve.com.olibersystem.ia.iacomerce.utils.ValoresEstaticos;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;


public class YahooThread extends Thread implements Runnable  {
	private static final Logger logger = LogManager.getLogger(YahooThread.class);
	private WebDataTimer dataEtoro;
	private InstrumentYahoo instrumento;
	private Stock a1;
	private Stock a2;
	private Stock a3;
	private Date t1;
	private Date t2;
	private Date t3;
	private List<Rate> lst;
	private long cambios;
	
	
	public YahooThread(InstrumentYahoo instrumentYahoo, WebDataTimer dataEtoro) {
		super();
		cambios = 0;
		instrumento = instrumentYahoo;
		this.dataEtoro = dataEtoro;
		this.start();
		
	}
	
	private void actualizarValores(Stock actual) {
		if(a2 != null) {
			a3 = a2;
			t3 = t2;
		}
		if(a1 != null) {
			a2 = a1;
			t2 = t1;
		}
		a1 = actual;
		t1 = new Date();
	}
	private void guardarFile() {
		if(a1 != null && a2 != null & a3 != null) {
			String data= "";
			String data2 = "";
			try {
				data = a1.getQuote().getPrice()+";"+a2.getQuote().getPrice()+";"+a3.getQuote().getPrice();
				if(lst != null) {
					data+=";"+lst.get(0).getBid()+";"+lst.get(1).getBid()+";"+lst.get(2).getBid();
					data2 = ";"+a1.getQuote().getPrice().compareTo(a2.getQuote().getPrice());
					data2 +=";"+(lst.get(0).getBid()<lst.get(1).getBid()?-1:lst.get(0).getBid()==lst.get(1).getBid()?0:1);
				}
				else
					data += ";0;0;0";
				data+=";"+ValoresEstaticos.formatoFecha(t1)+";"+ValoresEstaticos.formatoFecha(t2)+";"+ValoresEstaticos.formatoFecha(t3);
				if(lst != null)
					data+=";"+ValoresEstaticos.formatoFecha(lst.get(0).getDate())+";"+ValoresEstaticos.formatoFecha(lst.get(1).getDate())+";"+ValoresEstaticos.formatoFecha(lst.get(2).getDate());
				else
					data += ";"+ValoresEstaticos.formatoFecha(new Date())+";"+ValoresEstaticos.formatoFecha(new Date())+";"+ValoresEstaticos.formatoFecha(new Date());
				data += data2;
				ManejoArchivos.guardarTransaccion(this.instrumento.getSymbol(), data);
			} catch (Exception e) {
				logger.info("******NO HAY DATOS BUENOS *****{}",data);
			}
		}
	}
	
	public boolean evaluarComprar() {
		if(a1 != null && a2 != null & a3 != null) {
			if(a1.getQuote().getPrice().compareTo(a2.getQuote().getPrice()) > 0 && a2.getQuote().getPrice().compareTo(a3.getQuote().getPrice()) > 0) {
				logger.info("**************************************************");
				logger.info("COMPRAR \t{} ", this.instrumento.getSymbol());								
				if(lst != null) {
					logger.info("COMPRAR \t{} ", this.instrumento.getSymbol());
					logger.info("ETORO \t{}\t{}\t{} ", lst.get(0).getBid(), lst.get(1).getBid(), lst.get(2).getBid() );
					logger.info("DATOS \t{}\t{}\t{}",a1.getQuote().getPrice(), a2.getQuote().getPrice(), a3.getQuote().getPrice());
					logger.info("TIMES \t{}\t{}\t{}\t{}", ValoresEstaticos.formatoFecha(t1), ValoresEstaticos.formatoFecha(t2), ValoresEstaticos.formatoFecha(t3));
					logger.info("EOTOR \t{}\t{}\t{}\t{}",t1, t2, t3);
				}else {
					logger.info("FALTA ETORO");
				}
				logger.info("**************************************************");
			}
		}
		return true;
	}
	public boolean evaluarVender(){
		if(a1 != null && a2 != null & a3 != null) {
			if(a1.getQuote().getPrice().compareTo(a2.getQuote().getPrice()) < 0 && a2.getQuote().getPrice().compareTo(a3.getQuote().getPrice()) < 0) {
				System.out.println();
				logger.info("+++++++++++++++++++++++++++++++++++++++++++++++++++");
				logger.info("VENTA \t{} ", this.instrumento.getSymbol());				
				if(lst != null) {
					logger.info("PRECIO ETORO venta: \t{}\t{}\t{} ", lst.get(0).getBid(), lst.get(1).getBid(), lst.get(2).getBid() );
					logger.info("DATOS 				 \t{}\t{}\t{}",a1.getQuote().getPrice(), a2.getQuote().getPrice(), a3.getQuote().getPrice());					
					logger.info("TIME \t{} \t{} \t{} \t{}",this.instrumento.getSymbol(), t1, t2, t3);
				}else {
					logger.info("FALTA ETORO");
				}
				logger.info("+++++++++++++++++++++++++++++++++++++++++++++++++++");
			}
		}
		return true;
	}
	
	@Override
	public void run(){
		if(this.instrumento.getSymbol().length() ==0) return;
		while(true) {
			try {
				Stock tmp = YahooFinance.get(this.instrumento.getSymbol());
				lst =  this.dataEtoro.getPrecio(this.instrumento.getInstrumentEtoro().getId());
				this.actualizarValores(tmp);
				this.guardarFile();
				this.evaluarComprar();
				this.evaluarVender();
				Thread.sleep(ValoresEstaticos.SEGUNDOS_RECARGA_PETICONES);// los recargo cada 0,5 seg
			} catch (Exception e) {
				logger.warn("Mega Error: {} {}", this.instrumento.getSymbol(), e.getMessage());
				if(e.getMessage().equals("null")) {
					e.printStackTrace();
				}
				return;
			} 
		}
	}
	
}
