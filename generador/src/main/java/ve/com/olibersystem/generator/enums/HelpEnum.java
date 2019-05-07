package ve.com.olibersystem.generator.enums;

public enum HelpEnum {
	H("-h", "-h Peticion de Ayuda"),
	B("-b", "-b Crear un java bean");
	
	private String codigo;
	private String nombre;
	
	private HelpEnum(String codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	public boolean comparator(String codigo) {
		return this.codigo.equals(codigo);
	}	
	public static boolean compar(String codigo) {
		boolean res = false;
		for(HelpEnum he: HelpEnum.values()) {
			if(he.comparator(codigo))
				res = true;
		}
		return res;
	}
	public static HelpEnum valueof(String codigo) {
		HelpEnum h = null;
		for(HelpEnum he: HelpEnum.values()) {
			if(he.comparator(codigo))
				h = he;
			
		}
		return h;
	}
	
	@Override
	public String toString() {
		
		return this.nombre;
	}
}
