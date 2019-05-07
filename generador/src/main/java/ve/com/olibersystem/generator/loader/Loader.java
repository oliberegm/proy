package ve.com.olibersystem.generator.loader;

import java.util.ArrayList;
import java.util.List;

import ve.com.olibersystem.generator.enums.TiposModelos;

public abstract class Loader {
	
	private List<Field> fields;
	
	private TiposModelos modelo;
	
	public Loader() {
		init();
	}
	private void init() {
		this.fields = new ArrayList<Field>();
	}
	
	public abstract void cargar();
	
	public List<Field> getFields() {
		return fields;
	}
	
	
	public TiposModelos getModelo() {
		return modelo;
	}
	public void setModelo(TiposModelos modelo) {
		this.modelo = modelo;
	}

}
