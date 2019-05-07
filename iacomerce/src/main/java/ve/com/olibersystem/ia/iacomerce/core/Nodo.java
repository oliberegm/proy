package ve.com.olibersystem.ia.iacomerce.core;

public class Nodo{
	private String nombre;
	private Estados estado;
	private long peso = 0;
	private long pasadas = 0;
	private double estadistica1;
	private double estadistica2;
	public Nodo(String nombre, Estados estado) {
		this.estado = estado;
		this.nombre = nombre;
		this.estadistica1 = 0;
		this.estadistica2 = 0;
	}
	public void incPasadas() {
		pasadas++;
	}
	public void activacion(String nombre, Estados estado) {
		if(nombre.equals(this.nombre) && estado.equals(this.estado)) {
			peso++;
		}
	}
	
	
}