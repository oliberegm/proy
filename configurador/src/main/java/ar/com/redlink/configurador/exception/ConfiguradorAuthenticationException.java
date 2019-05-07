package ar.com.redlink.homebanking.exception;

import org.springframework.security.core.AuthenticationException;

public class ConfiguradorAuthenticationException extends AuthenticationException {

	private static final long serialVersionUID = 1L;

	public ConfiguradorAuthenticationException(String msg) {
		super(msg);
	}

}
