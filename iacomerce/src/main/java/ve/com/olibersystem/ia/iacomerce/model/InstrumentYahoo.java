package ve.com.olibersystem.ia.iacomerce.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import ve.com.olibersystem.ia.iacomerce.model.etoro.InstrumentDisplayData;

@Entity()
@Table(name = "instrument_yahoo")
public class InstrumentYahoo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String symbol;
	private String name;
	
	
	@OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "instrumentEtoro_id", nullable = false)
	private InstrumentEtoro instrumentEtoro;
	
	public InstrumentYahoo() {
		
	}
	public InstrumentYahoo(String symbol, String name, InstrumentEtoro  etoro) {
		super();
		this.symbol= symbol;
		this.name = name;
		this.instrumentEtoro = etoro;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public InstrumentEtoro getInstrumentEtoro() {
		return instrumentEtoro;
	}
	public void setInstrumentEtoro(InstrumentEtoro instrumentEtoro) {
		this.instrumentEtoro = instrumentEtoro;
	}
	
	
}
