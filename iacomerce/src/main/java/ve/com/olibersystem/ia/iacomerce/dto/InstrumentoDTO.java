package ve.com.olibersystem.ia.iacomerce.dto;

import ve.com.olibersystem.ia.iacomerce.utils.EmpresasEnum;

public class InstrumentoDTO extends DTO{
	
	public InstrumentoDTO(EmpresasEnum empresa, DTO valores) {
		super();
		this.empresa = empresa;
		this.valores = valores;
	}
	
	
	private EmpresasEnum empresa;
	private DTO valores;
	
	public EmpresasEnum getEmpresa() {
		return empresa;
	}
	public void setEmpresa(EmpresasEnum empresa) {
		this.empresa = empresa;
	}
	public DTO getValores() {
		return valores;
	}
	public void setValores(DTO valores) {
		this.valores = valores;
	}
}
