package ar.com.redlink.configurador.exception;

import ar.com.redlink.framework.services.exception.RedLinkServiceException;

public class NoDataFoundException extends RedLinkServiceException {

	private static final long serialVersionUID = 1L;
	
	public NoDataFoundException(String message) {
		super(message);
	}

}
