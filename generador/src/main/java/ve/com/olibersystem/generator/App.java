package ve.com.olibersystem.generator;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import ve.com.olibersystem.generator.controller.ConsolaController;;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger logger = Logger.getLogger(App.class);

    public static void main( String[] args )
    {
        logger.info("####### GENERADOR DE MAQUETAS PARA JAVA Y ANGULAR ##########");
        ConsolaController c = new ConsolaController();
        c.ejecutar(args);
    }
    
        
}
