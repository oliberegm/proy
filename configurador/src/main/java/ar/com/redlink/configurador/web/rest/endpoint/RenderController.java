package ar.com.redlink.configurador.web.rest.endpoint;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/render")
public interface RenderController extends BaseController {
	
//	@RequestMapping(value = "/entidad/{fiid}", method = RequestMethod.GET)
//	@ResponseBody
//	//@PreAuthorize("hasRole('ROLE_HB_CFG_ADMINISTRADOR') or (hasAnyRole('ROLE_HB_CFG_CONSULTA', 'ROLE_HB_CFG_MODIFICACION') and hasPermission(principal, #fiid))")
//	public HttpEntity<RenderToJSON> entidadGetRender(HttpServletRequest request, HttpServletResponse response, @PathVariable("fiid") String fiid)
//			throws RedLinkServiceException;
}
