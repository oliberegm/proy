package ar.com.redlink.configurador.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class ExceptionHandler implements HandlerExceptionResolver {
	protected final Log logger = LogFactory.getLog(this.getClass());
	
	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		try {
			logger.error("Se produjo un error", ex);
			request.setAttribute("logException", ex);
			if(ex instanceof AccessDeniedException)
				response.sendError(HttpServletResponse.SC_FORBIDDEN, ex.getLocalizedMessage());
			else if(ex instanceof ConfiguradorAuthenticationException)
				response.sendError(HttpServletResponse.SC_UNAUTHORIZED, ex.getLocalizedMessage());
			else
				response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, ex.getLocalizedMessage());
		} catch (Exception e) {
			logger.error("Se produjo un error del error",e);
		}
		return new ModelAndView();
	}
	
}