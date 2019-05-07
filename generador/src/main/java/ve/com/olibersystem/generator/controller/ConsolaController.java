package ve.com.olibersystem.generator.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import ve.com.olibersystem.generator.enums.HelpEnum;
import ve.com.olibersystem.generator.task.HelpTaks;
import ve.com.olibersystem.generator.task.JavaBeansTask;
import ve.com.olibersystem.generator.task.Task;

public class ConsolaController {
	private static final Logger logger = Logger.getLogger(ConsolaController.class);
	private Map<HelpEnum, Task> tasks;
    
    
    public void ejecutar(String[] args) {
    	this.crearTasks();
    	for(int i = 0; i < args.length; i++) {
    		if(HelpEnum.compar(args[i])) {
    			Task t = tasks.get(HelpEnum.valueof(args[i]));
    			i++;
    			if(!t.execution( (i) < args.length?args[i]:""))
    				break;
    			
    		}
    	}
    	
    }
    
    public void crearTasks() {
    	tasks = new HashMap<HelpEnum, Task>();
    	tasks.put(HelpEnum.H, new HelpTaks());
    	tasks.put(HelpEnum.B, new JavaBeansTask());
    }

}
