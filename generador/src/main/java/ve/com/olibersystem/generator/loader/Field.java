package ve.com.olibersystem.generator.loader;

import ve.com.olibersystem.generator.enums.TiposDatos;

public class Field {
	
	private String nombreVista;
	private String nombreAlmacenamiento;
	private TiposDatos tiposDatos;

	public Field(String nombreVista, String nombreAlmacenamiento, TiposDatos tiposDatos) {
		super();
		this.nombreVista = nombreVista;
		this.nombreAlmacenamiento = nombreAlmacenamiento;
		this.tiposDatos = tiposDatos;
	}

	public String getNombreVista() {
		return nombreVista;
	}

	public void setNombreVista(String nombreVista) {
		this.nombreVista = nombreVista;
	}

	public String getNombreAlmacenamiento() {
		return nombreAlmacenamiento;
	}

	public void setNombreAlmacenamiento(String nombreAlmacenamiento) {
		this.nombreAlmacenamiento = nombreAlmacenamiento;
	}

	public TiposDatos getTiposDatos() {
		return tiposDatos;
	}

	public void setTiposDatos(TiposDatos tiposDatos) {
		this.tiposDatos = tiposDatos;
	}

	@Override
	public String toString() {
		return "Field [nombreVista=" + nombreVista + ", nombreAlmacenamiento=" + nombreAlmacenamiento + ", tiposDatos="
				+ tiposDatos + "]";
	}
	
	
	

}
