package ve.com.olibersystem.ia.iacomerce.threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import ve.com.olibersystem.ia.iacomerce.model.etoro.InstrumentsWebData;
import ve.com.olibersystem.ia.iacomerce.model.etoro.WebDataTimer;
import ve.com.olibersystem.ia.iacomerce.utils.ValoresEstaticos;



public class EtoroThread extends Thread implements Runnable  {
	private static final Logger logger = LoggerFactory.getLogger(EtoroThread.class);
	private RestTemplate restTemplate;
	private WebDataTimer dataEtoro;
	
	public EtoroThread(RestTemplate restTemplate, WebDataTimer dataEtoro ) {
		this.restTemplate = restTemplate;
		this.dataEtoro = dataEtoro;
		this.start();
	}
	
	@Override
	public void run(){
		
		while(true) {			
			try {
				leerDatos();
				Thread.sleep(ValoresEstaticos.SEGUNDOS_RECARGA_PETICONES);
			} catch (Exception e) {
				logger.error("TENEMOS UN ERROR ETORO: {}", e.getMessage());
			}
		}
	}
	
	private void leerDatos() {
		String data2 = this.restTemplate.getForObject(ValoresEstaticos.ETORO_PETICION_DATOS, String.class);
		Gson gson = new Gson();
		dataEtoro.addInstrumentsWebData(gson.fromJson(data2, InstrumentsWebData.class));
		//dataEtoro.setHoraConsulta(new Date());		
	}

}
