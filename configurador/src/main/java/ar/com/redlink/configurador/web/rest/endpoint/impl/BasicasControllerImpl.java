package ar.com.redlink.configurador.web.rest.endpoint.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpEntity;

import ar.com.redlink.configurador.dto.EntidadDTO;
import ar.com.redlink.configurador.web.rest.endpoint.BasicasController;

public class BasicasControllerImpl implements BasicasController {

	@Override
	public HttpEntity<?> root(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpEntity<EntidadDTO> getEntidades(HttpServletRequest request, HttpServletResponse response) {
		
		return null;
	}

}
