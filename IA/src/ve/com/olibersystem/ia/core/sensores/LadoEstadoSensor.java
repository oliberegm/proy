package ve.com.olibersystem.ia.core.sensores;

import java.util.Random;

import ve.com.olibersystem.ia.core.agentes.Agente;
import ve.com.olibersystem.ia.core.agentes.impl.AspiradoraRacionalAgente;
import ve.com.olibersystem.ia.perceptores.LadoEstadoPercepcion;
import ve.com.olibersystem.ia.perceptores.Percepcion;

public class LadoEstadoSensor implements Sensor {
	private AspiradoraRacionalAgente agente;
	@Override
	public Percepcion onLectura() {
		Random randomGenerator = new Random();
		return  new LadoEstadoPercepcion(
				randomGenerator.nextInt(1)+1,
				randomGenerator.nextBoolean());
	}
	
	@Override
	public void addAgente(Agente agente) {
		this.agente = (AspiradoraRacionalAgente) agente;
	}

}
