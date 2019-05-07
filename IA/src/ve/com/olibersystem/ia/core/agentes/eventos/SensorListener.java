package ve.com.olibersystem.ia.core.agentes.eventos;

import java.util.EventListener;

import ve.com.olibersystem.ia.perceptores.Percepcion;

public interface SensorListener extends EventListener {
	
	public abstract void onLecturas(PercepcionEvent evt);
}
