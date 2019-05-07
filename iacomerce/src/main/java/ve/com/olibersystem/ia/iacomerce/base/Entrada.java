package ve.com.olibersystem.ia.iacomerce.base;

import java.math.BigDecimal;

public class Entrada {
	private float wPeso;
	private BigDecimal entrada;
	public float getwPeso() {
		return wPeso;
	}
	public void setwPeso(float wPeso) {
		this.wPeso = wPeso;
	}
	public BigDecimal getEntrada() {
		return entrada;
	}
	public void setEntrada(BigDecimal entrada) {
		this.entrada = entrada;
	}
}
