package ve.com.olibersystem.ia.iacomerce.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import ve.com.olibersystem.ia.iacomerce.model.InstrumentYahoo;
import ve.com.olibersystem.ia.iacomerce.model.etoro.InstrumentDisplayDatas;
import ve.com.olibersystem.ia.iacomerce.model.etoro.WebDataTimer;
import ve.com.olibersystem.ia.iacomerce.repository.CrudRepository.InstrumentYahooRepository;
import ve.com.olibersystem.ia.iacomerce.services.InstrumentServices;
import ve.com.olibersystem.ia.iacomerce.services.LoadDatasTrainnersService;
import ve.com.olibersystem.ia.iacomerce.threads.EtoroThread;
import ve.com.olibersystem.ia.iacomerce.threads.YahooThread;
import ve.com.olibersystem.ia.iacomerce.utils.ValoresEstaticos;

@Service
public class LoadDatasTrainnersServieImpl implements LoadDatasTrainnersService{
	private static final Logger logger = LoggerFactory.getLogger(LoadDatasTrainnersServieImpl.class);
	
	@Autowired
    private WebDataTimer webDataTimer;
	
    @Autowired
    private InstrumentYahooRepository instrumentYahooRepository; 
    
    @Autowired
    private RestTemplate restTemplate;
    
    @Autowired
    private InstrumentServices instrumentServices;
    
    @Override
    public void executeLoadData() {
    	logger.info("LEER LA DATA ORIGINAL DE ETORO");
    	String data = restTemplate.getForObject(ValoresEstaticos.ETORO_PETICION_INICIALIZAR, String.class);
    	Gson gson = new Gson();
    	InstrumentDisplayDatas d = gson.fromJson(data, InstrumentDisplayDatas.class);
    	logger.info("cargando los de etro");
    	instrumentServices.guardarInstrumentoEtoro(d);
		logger.info("cargando los de yahoo");
		instrumentServices.guardarInstrumentoYahoo();
		logger.info("finalizar");
    }
    
    @Override
    public void executeAsynchronouslyEtoro() {
    	logger.info("LEER LAS OPERACIONES DE ETORO POR MEDIO DEL HILO");
    	new EtoroThread(this.restTemplate, this.webDataTimer );
    }    
    
    @Override
    public void executeAsynchronouslYahoo() {
    	logger.info("LEER LAS OPERACIONES DE YAHOO POR MEDIO DEL HILO");
    	for(InstrumentYahoo ins: instrumentYahooRepository.findAll()) {
    		//if(ins.getSymbol().equals("IWM"))
    			new YahooThread(ins, this.webDataTimer);
    	}
    }
}
