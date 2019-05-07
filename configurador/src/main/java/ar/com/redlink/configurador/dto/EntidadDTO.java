package ar.com.redlink.configurador.dto;

public class EntidadDTO extends DTO {

	private static final long serialVersionUID = 1L;

	private Long idEntidad;
	private String fiid;
	private String nombre;
	private String codProducto;
	//private ParametrosEntidadDTO parametrosEntidad;
	
	public String getFiid() {
		return fiid;
	}
	public void setFiid(String fiid) {
		this.fiid = fiid;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodProducto() {
		return codProducto;
	}
	public void setCodProducto(String codProducto) {
		this.codProducto = codProducto;
	}
//	public ParametrosEntidadDTO getParametrosEntidad() {
//		return parametrosEntidad;
//	}
//	public void setParametrosEntidad(ParametrosEntidadDTO parametrosEntidad) {
//		this.parametrosEntidad = parametrosEntidad;
//	}
	public Long getIdEntidad() {
		return idEntidad;
	}
	public void setIdEntidad(Long idEntidad) {
		this.idEntidad = idEntidad;
	}
	
}