package ve.com.olibersystem.ia.core.agentes.impl;

import java.util.HashMap;
import java.util.Map;

import ve.com.olibersystem.ia.core.agentes.Accion;
import ve.com.olibersystem.ia.perceptores.LadoEstadoPercepcion;
import ve.com.olibersystem.ia.perceptores.Percepcion;

public class BasicasAccion implements Accion {
	private Map<LadoEstadoPercepcion, String> listadoAcciones;
	
	public BasicasAccion() {
		this.onInit();
	}
	
	private void onInit() {
		this.listadoAcciones = new HashMap<>();
		this.listadoAcciones.put(new LadoEstadoPercepcion(1, true), "Derecha");
		this.listadoAcciones.put(new LadoEstadoPercepcion(1, false), "Limpiar");
		this.listadoAcciones.put(new LadoEstadoPercepcion(2, true), "Iquierda");
		this.listadoAcciones.put(new LadoEstadoPercepcion(2, false), "Limpiar");
		
	}
	public void entrada(Percepcion p) {
		System.out.println(p);
		System.out.println(this.listadoAcciones.get(p));
		
	}

}
