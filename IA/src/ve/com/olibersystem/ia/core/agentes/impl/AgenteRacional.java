package ve.com.olibersystem.ia.core.agentes.impl;

import ve.com.olibersystem.ia.core.agentes.Accion;
import ve.com.olibersystem.ia.core.sensores.LadoEstadoSensor;
import ve.com.olibersystem.ia.core.sensores.Sensor;

public class AgenteRacional extends Thread implements Runnable{
	private Sensor sensor1;
	private Accion accion1;
	public AgenteRacional() {
		this.onInit();
	}
	
	private void onInit() {
		sensor1 = new LadoEstadoSensor();
		accion1 = new BasicasAccion();
	}
	
	
	@Override
	public void run() {
		for(int i =0 ; i< 10; i++) {
			accion1.entrada(sensor1.onLectura());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
