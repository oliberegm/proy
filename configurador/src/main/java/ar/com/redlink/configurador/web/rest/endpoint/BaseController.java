package ar.com.redlink.configurador.web.rest.endpoint;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public interface BaseController {

	@RequestMapping(value="", method = RequestMethod.GET)
	public @ResponseBody HttpEntity<?> root(HttpServletRequest request,
			HttpServletResponse response) throws Exception;
	
}
