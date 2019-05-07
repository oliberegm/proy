package ve.com.olibersystem.generator.task;

import org.apache.log4j.Logger;

import ve.com.olibersystem.generator.enums.HelpEnum;

public class HelpTaks implements Task{
	private final HelpEnum he = HelpEnum.H;
	
	private static final Logger logger = Logger.getLogger(HelpTaks.class);
	public String mensajeAyuda() {
		return "Modulo de ayuda de usuario";
	}
	
	public boolean execution(String comando) {
		logger.info(this.mensajeAyuda());
		for(HelpEnum he: HelpEnum.values()) {
			logger.info(he);
		}
		return false;		
	}

}
