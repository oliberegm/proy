package ve.com.olibersystem.ia.core.agentes.eventos;

import java.util.EventObject;

import ve.com.olibersystem.ia.perceptores.Percepcion;

public abstract class PercepcionEvent extends EventObject{

	private static final long serialVersionUID = -8345299552985715476L;
	private Percepcion p; 

	public PercepcionEvent(Object source) {
		super(source);
		p = this.getPercepcion();
	}
	public Percepcion getP() {
		return p;
	}
	
	public abstract Percepcion getPercepcion();
}
