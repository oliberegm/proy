package ve.com.olibersystem.ia.iacomerce.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity()
@Table(name = "instrument_etoro")
public class InstrumentEtoro implements Serializable{
	@Id
	private Long id;
	private String symbol;
	private Long exchangeID;
	private String name;
	
	@OneToOne(fetch= FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "instrumentEtoro")
	private InstrumentYahoo instrumentYahoo;
	
	public InstrumentEtoro() {
		super();
	}
	
	public InstrumentEtoro(Long id, String symbol, Long exchangeID, String name, InstrumentYahoo instrumentYahoo) {
		super();
		this.id = id;
		this.symbol = symbol;
		this.exchangeID = exchangeID;
		this.name = name;
		this.instrumentYahoo = instrumentYahoo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Long getExchangeID() {
		return exchangeID;
	}

	public void setExchangeID(Long exchangeID) {
		this.exchangeID = exchangeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public InstrumentYahoo getInstrumentYahoo() {
		return instrumentYahoo;
	}

	public void setInstrumentYahoo(InstrumentYahoo instrumentYahoo) {
		this.instrumentYahoo = instrumentYahoo;
	}

	@Override
	public String toString() {
		return "InstrumentEtoro [id=" + id + ", symbol=" + symbol + ", exchangeID=" + exchangeID + ", name=" + name
				+ ", instrumentYahoo=" + instrumentYahoo + "]";
	} 
	
	
	

}
