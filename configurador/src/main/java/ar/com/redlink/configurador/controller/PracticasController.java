package ar.com.redlink.configurador.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/practica")
public interface PracticasController {

	@RequestMapping(method = RequestMethod.GET)
	public String index();
	
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String modificar();
	
	@RequestMapping(value = "/find", method = RequestMethod.POST)
	public String consulta();
	
	@RequestMapping(value = "/all", method = RequestMethod.POST)
	public String todos();
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String agregar();
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String eliminar();
	
	
}
