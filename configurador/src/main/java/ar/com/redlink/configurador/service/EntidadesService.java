package ar.com.redlink.configurador.service;

import org.springframework.stereotype.Service;

import ar.com.redlink.configurador.dto.EntidadDTO;

@Service
public interface EntidadesService {
	
	public EntidadDTO listadoEntidades();
}
