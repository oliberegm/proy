package ar.com.redlink.configurador.entities;

public class Entidad implements RedLinkEntity {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String fiid;
	private String nombre;
	private String codProducto;
	//private ParametrosEntidad parametrosEntidad;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
//	public ParametrosEntidad getParametrosEntidad() {
//		return parametrosEntidad;
//	}
//	public void setParametrosEntidad(ParametrosEntidad parametrosEntidad) {
//		this.parametrosEntidad = parametrosEntidad;
//	}
	public String getCodProducto() {
		return codProducto;
	}
	public void setCodProducto(String codProducto) {
		this.codProducto = codProducto;
	}

}