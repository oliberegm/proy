package ve.com.olibersystem.generator.task;

public class JavaBeansTask implements Task{
	
	public boolean execution(String comando) {
		
		return false;
	}
	
	public String mensajeAyuda() {		
		return "Genera los beans debe indicar el package ejmp: -jb com.ejemplo.bean";
	}

}
