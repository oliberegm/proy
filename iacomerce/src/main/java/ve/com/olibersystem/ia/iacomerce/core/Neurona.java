package ve.com.olibersystem.ia.iacomerce.core;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ve.com.olibersystem.ia.iacomerce.base.Entrada;

public class Neurona {
	public static final Logger LOG = LoggerFactory.getLogger(Neurona.class);
	private List<Entrada> entradas;
	
	
	Neurona() {
		entradas = new ArrayList<>();
	}
	
	public void conexionSinaptica(Entrada entradaC) {
		entradas.add(entradaC);
	}
	
	private void reglaPropagacion() {
		
	}
	
	private void activacion() {
		
	}
	
	public void salida() {
		
	}

}
