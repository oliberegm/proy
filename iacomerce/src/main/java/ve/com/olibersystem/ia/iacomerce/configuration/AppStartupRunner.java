package ve.com.olibersystem.ia.iacomerce.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import ve.com.olibersystem.ia.iacomerce.services.LoadDatasTrainnersService;

@Component
public class AppStartupRunner implements ApplicationRunner	{
	private static final Logger logger = LoggerFactory.getLogger(AppStartupRunner.class);
	
	@Autowired
	LoadDatasTrainnersService loadDatasTrainnersService;
	
	@Override
    public void run(ApplicationArguments args) throws Exception {
		logger.info("Generando los servios base");
		//loadDatasTrainnersService.executeLoadData();
		loadDatasTrainnersService.executeAsynchronouslyEtoro();
		loadDatasTrainnersService.executeAsynchronouslYahoo();
				
	}
	
}