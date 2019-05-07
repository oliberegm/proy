package ve.com.olibersystem.generator.task;

public interface Task {
	
	/**
	 * 
	 * @return
	 */
	public String mensajeAyuda();
	
	public boolean execution(String comando);
	
}
