package ve.com.olibersystem.ia.iacomerce.dto;

public class RespuestaDTO extends DTO{
	
	private DTO respuesta;
	
	private EstadoDTO estado;

	public DTO getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(DTO respuesta) {
		this.respuesta = respuesta;
	}

	public EstadoDTO getEstado() {
		return estado;
	}

	public void setEstado(EstadoDTO estado) {
		this.estado = estado;
	}
	
	
}
