package ar.com.redlink.configurador.web.rest.endpoint;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.redlink.configurador.dto.EntidadDTO;

@RestController("/basica")
public interface BasicasController  extends BaseController  {
	
	@RequestMapping(value="/entidades", method=RequestMethod.GET)
	@ResponseBody
	//@PreAuthorize("hasRole('ROLE_HB_CFG_ADMINISTRADOR') or (hasAnyRole('ROLE_HB_CFG_CONSULTA', 'ROLE_HB_CFG_MODIFICACION') and hasPermission(principal, #fiid))")
	public HttpEntity<EntidadDTO> getEntidades(HttpServletRequest request, HttpServletResponse response);
}
