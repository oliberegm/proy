package ar.com.redlink.configurador.controller.impl;


import org.springframework.web.bind.annotation.RestController;

import ar.com.redlink.configurador.controller.PracticasController;


@RestController
public class PracticasImplController  implements PracticasController{

	@Override
	public String index(){
		return "hola mundo";
	}
	@Override
	public String modificar(){
		return "hola mundo";
	}
	@Override
	public String consulta(){
		return "hola mundo";
	}
	@Override
	public String todos(){
		return "hola mundo";
	}
	@Override
	public String agregar(){
		return "hola mundo";
	}
	@Override
	public String eliminar(){
		return "hola mundo";
	}
	
}
