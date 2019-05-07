package ve.com.olibersystem.ia.core.agentes.impl;

import java.util.Random;

import ve.com.olibersystem.ia.core.agentes.eventos.SensorListener;
import ve.com.olibersystem.ia.perceptores.LadoEstadoPercepcion;
import ve.com.olibersystem.ia.perceptores.Percepcion;

public class SensorBasico extends Thread implements Runnable{ 
	private Random randomGenerator = new Random();
	SensorListener sensor;
	@Override
	public void run() {
		for(int i =0 ; i< 10; i++) {			
			try {
				this.wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void addEventListener(SensorListener sensor) {
		this.sensor = sensor;
	}
	
	

}
/*extends EventObject {
	private static final long serialVersionUID = -1390890632028553460L;
	private Percepcion percepcion;
	public SensorBasico(Object source, Percepcion p) {
		super(source);
		this.percepcion = p;
	}
	public Percepcion getPercepcion() {
		return percepcion;
	}	
}
*/