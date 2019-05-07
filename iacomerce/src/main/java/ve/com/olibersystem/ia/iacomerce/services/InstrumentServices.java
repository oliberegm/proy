package ve.com.olibersystem.ia.iacomerce.services;

import ve.com.olibersystem.ia.iacomerce.dto.DTO;
import ve.com.olibersystem.ia.iacomerce.dto.RespuestaDTO;
import ve.com.olibersystem.ia.iacomerce.model.etoro.InstrumentDisplayDatas;
import ve.com.olibersystem.ia.iacomerce.model.etoro.InstrumentsWebData;

public interface InstrumentServices {
	
	public DTO guardarInstrumento(DTO instrumento);
	
	public DTO guardarInstrumentoEtoro(InstrumentDisplayDatas data );

	DTO guardarInstrumentoYahoo();

	RespuestaDTO actualizarValores(InstrumentsWebData dataEtoro);

	String estado();

}
