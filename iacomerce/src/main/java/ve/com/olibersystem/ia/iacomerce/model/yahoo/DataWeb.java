package ve.com.olibersystem.ia.iacomerce.model.yahoo;

public class DataWeb {
	private long idEtoro;	
	private String symbol;
	
	
	
	public DataWeb(long idEtoro, String symbol) {
		super();
		this.idEtoro = idEtoro;
		this.symbol = symbol;
	}
	public long getIdEtoro() {
		return idEtoro;
	}
	public void setIdEtoro(long idEtoro) {
		this.idEtoro = idEtoro;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	

}
