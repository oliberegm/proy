package ve.com.olibersystem.ia.iacomerce.services.impl;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ve.com.olibersystem.ia.iacomerce.App;
import ve.com.olibersystem.ia.iacomerce.model.InstrumentYahoo;
import ve.com.olibersystem.ia.iacomerce.services.ConsultadorYahooService;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

@Service
public class ConsultadorYahooServiceImpl extends Thread implements  ConsultadorYahooService{
	private static final Logger log = LoggerFactory.getLogger(App.class);
	private boolean modo = true;//true compra, false venta
	
	private int controlador;
	private static final int MAX_CORRIDAS = 100;
	private InstrumentYahoo yahoo;
	
	private BigDecimal precioEtoro;
	private BigDecimal precioYahoo;
	
	private void imprimirMensaje() {
		log.info("{} {} a {} vs {} dif {} ", modo?"COMPRA":"FALSE", yahoo.getSymbol(), precioYahoo, precioEtoro, precioYahoo.subtract(precioEtoro));
		
	}
	
	@Override
	public void run() {
		for(controlador = 0; controlador < MAX_CORRIDAS; controlador++) {
			loadDataYahoo();
			loadDataEtoro();
			imprimirMensaje();
			
		}
	}
	
	private void loadDataYahoo() {
		try {
			Stock y = YahooFinance.get(yahoo.getSymbol());
			precioYahoo = y.getStats().getPriceSales();
		} catch (IOException e) {
			log.warn("Mega Error: {}", e.getMessage());
		}
	}
	private void loadDataEtoro() {
		
		
		
		
	}
	
	public void setYahoo(InstrumentYahoo yahoo) {
		this.yahoo = yahoo;
	}

}
