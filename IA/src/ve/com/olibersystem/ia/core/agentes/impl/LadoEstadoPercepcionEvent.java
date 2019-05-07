package ve.com.olibersystem.ia.core.agentes.impl;

import java.util.Random;

import ve.com.olibersystem.ia.core.agentes.eventos.PercepcionEvent;
import ve.com.olibersystem.ia.perceptores.LadoEstadoPercepcion;
import ve.com.olibersystem.ia.perceptores.Percepcion;

public class LadoEstadoPercepcionEvent extends PercepcionEvent{
	
	public LadoEstadoPercepcionEvent(Object source) {
		super(source);		
	}

	@Override
	public Percepcion getPercepcion() {
		Random randomGenerator = new Random();
		return  new LadoEstadoPercepcion(
				randomGenerator.nextInt(2),
				randomGenerator.nextBoolean());
	}
}
