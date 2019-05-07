package ve.com.olibersystem.ia.perceptores;

public class LadoEstadoPercepcion extends Percepcion{
	
	private int lado;
	private boolean estado;
	public LadoEstadoPercepcion(int lado, boolean estado) {		
		this.lado = lado;
		this.estado = estado;
	}
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Percepcion generado [lado=" + lado + ", estado=" + estado + "]";
	}
}
