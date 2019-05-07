package ve.com.olibersystem.ia.iacomerce.services.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ve.com.olibersystem.ia.iacomerce.App;
import ve.com.olibersystem.ia.iacomerce.dto.DTO;
import ve.com.olibersystem.ia.iacomerce.dto.EstadoDTO;
import ve.com.olibersystem.ia.iacomerce.dto.InstrumentoDTO;
import ve.com.olibersystem.ia.iacomerce.dto.InstrumentoETORODTO;
import ve.com.olibersystem.ia.iacomerce.dto.RespuestaDTO;
import ve.com.olibersystem.ia.iacomerce.model.InstrumentEtoro;
import ve.com.olibersystem.ia.iacomerce.model.InstrumentYahoo;
import ve.com.olibersystem.ia.iacomerce.model.etoro.InstrumentDisplayData;
import ve.com.olibersystem.ia.iacomerce.model.etoro.InstrumentDisplayDatas;
import ve.com.olibersystem.ia.iacomerce.model.etoro.InstrumentsWebData;
import ve.com.olibersystem.ia.iacomerce.model.etoro.Rate;
import ve.com.olibersystem.ia.iacomerce.repository.CrudRepository.InstrumentEtoroRepository;
import ve.com.olibersystem.ia.iacomerce.repository.CrudRepository.InstrumentYahooRepository;
import ve.com.olibersystem.ia.iacomerce.repository.etoro.CrudRepository.InstrumentDisplayDatasRepository;
import ve.com.olibersystem.ia.iacomerce.services.InstrumentServices;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

@Service
public class InstrumentServicesImpl implements InstrumentServices {
	private static final Logger log = LoggerFactory.getLogger(App.class);
	
	@Autowired
	private InstrumentEtoroRepository instrumentEtoroRepository;
	
	@Autowired
	private InstrumentDisplayDatasRepository instrumentDisplayDatasRepository;
	
	@Autowired
	private InstrumentYahooRepository instrumentYahooRepository;
	
	@Override
	public String estado() {
		return "funciona";
	}
	
	
	@Override
	public DTO guardarInstrumento(DTO instrumento) {
		RespuestaDTO rsp = null;
		switch( ((InstrumentoDTO)instrumento).getEmpresa()) {
			case ETORO: rsp = this.saveEtoro((InstrumentoETORODTO) ((InstrumentoDTO)instrumento).getValores()); break;
			case YAHOOFINANCE: break;
		}
		return rsp;
	}
	
	@Override
	public DTO guardarInstrumentoEtoro(InstrumentDisplayDatas data) {
		instrumentDisplayDatasRepository.saveAll(data.getInstrumentDisplayDatas());
		List<InstrumentEtoro> lista= new ArrayList<>();
		for(InstrumentDisplayData idd : data.getInstrumentDisplayDatas()) {
			lista.add(new InstrumentEtoro(idd.getInstrumentID(), idd.getSymbolFull(), idd.getExchangeID(), idd.getInstrumentDisplayName(), null));
		}
		instrumentEtoroRepository.saveAll(lista);
		return null;
	}
	
	@Override
	public DTO guardarInstrumentoYahoo() {
		List<InstrumentYahoo> lista = new ArrayList<>();
		List<String> nombres = new ArrayList<>();
		Map<String, InstrumentEtoro> mapa = new HashMap<>();
		for(InstrumentEtoro idd : instrumentEtoroRepository.findAll() ) {
			nombres.add(idd.getSymbol());
			mapa.put(idd.getSymbol(), idd);
		}
		try {
			String[] stockArr = new String[nombres.size()];
			stockArr = nombres.toArray(stockArr);
			for (Map.Entry<String, Stock> entry : YahooFinance.get(stockArr).entrySet()) {
				entry.getKey();
				lista.add(new InstrumentYahoo(entry.getValue().getSymbol(), entry.getValue().getName(), mapa.get(entry.getKey())));
			}				
		} catch (IOException e) {
			log.warn("Mega Error: "+ e.getMessage());
		}
		
		instrumentYahooRepository.saveAll(lista);
		return null;
	}
	
	@Override
	public RespuestaDTO actualizarValores(InstrumentsWebData dataEtoro) {
		
		for(Rate r: dataEtoro.getRates()) {
			Optional<InstrumentEtoro> daoetoro =  instrumentEtoroRepository.findById(r.getInstrumentID());
			try {
				YahooFinance.get(daoetoro.get().getInstrumentYahoo().getSymbol());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
		
		
		return null;
	}
	
	
	
	private RespuestaDTO saveEtoro(InstrumentoETORODTO instrumento) {
		RespuestaDTO rsp = new RespuestaDTO();
		//rsp.setEstado(new EstadoDTO(HttpStatus.OK, "todo bien"));
		InstrumentEtoro ie = new InstrumentEtoro();
		//ManualMapper.instrumentETORO(ie, instrumento);
		instrumentEtoroRepository.save(ie);
		return rsp;
	}
	

}
