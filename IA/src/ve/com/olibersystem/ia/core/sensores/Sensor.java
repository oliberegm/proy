package ve.com.olibersystem.ia.core.sensores;

import ve.com.olibersystem.ia.core.agentes.Agente;
import ve.com.olibersystem.ia.perceptores.Percepcion;

public interface Sensor {
	public Percepcion onLectura();
	
	public void addAgente(Agente agente);
}
