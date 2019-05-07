package ve.com.olibersystem.ia.iacomerce.base;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ve.com.olibersystem.ia.iacomerce.event.IValoresListener;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class Valores implements Runnable, IValoresListener {
	private Stock stockYahoo; 
	private String symbol;
	private Date fechaCambio;
	public static final long TIEMPO_PARADA = 100;
	private boolean observable;
	private BigInteger iteraciones;
	private List<IValoresListener> mercado;
	

	public Valores(String symbol) {
		this.symbol = symbol;
		this.observable = true;
		this.iteraciones = BigInteger.ZERO;
		this.mercado = new ArrayList<>();
	}
	
	
	@Override
	public void run() {
		while(true) {
			try {
				if(this.iteraciones.equals(BigInteger.valueOf(10000))) break;
				Stock temp = YahooFinance.get(this.symbol);
				if(!temp.getQuote().getPrice().equals(stockYahoo.getQuote().getPrice() )) {  
					stockYahoo = temp;
					this.notificarCambioPrecio();
				}
				Thread.sleep(TIEMPO_PARADA);
			} catch (InterruptedException e) {e.printStackTrace(); break; 
			} catch (IOException e) { e.printStackTrace(); break;
			}
		}
		
	}

	private void obtenerInformacion() {
		try {
			stockYahoo = YahooFinance.get(this.symbol);			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void notificarCambioPrecio() {
		for(IValoresListener v : mercado)
			v.OnCambioPrecio(this);
	}
	public void addListener(IValoresListener ivl) {
		this.mercado.add(ivl);
	}
	
	@Override
	public void OnCambioPrecio(Valores valores) {
		if(this.observable) {
			//que hago lo estoy observando 
		}		
	}
	
	public Stock getStockYahoo() {
		obtenerInformacion();
		return stockYahoo;
	}
	
	
}
