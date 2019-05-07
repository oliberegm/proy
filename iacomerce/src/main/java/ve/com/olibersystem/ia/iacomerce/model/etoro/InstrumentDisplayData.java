package ve.com.olibersystem.ia.iacomerce.model.etoro;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity()
@Table(name = "instrument_data_etoro")

public class InstrumentDisplayData {
	
	private Long ExchangeID;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
	private List<Images> Images;
	private String InstrumentDisplayName;
	@Id
	private Long InstrumentID;
	private Long InstrumentTypeID;
	private String SymbolFull;
	public Long getExchangeID() {
		return ExchangeID;
	}
	public void setExchangeID(Long exchangeID) {
		this.ExchangeID = exchangeID;
	}
	public List<Images> getImages() {
		return Images;
	}
	public void setImages(List<Images> images) {
		this.Images = images;
	}
	public String getInstrumentDisplayName() {
		return InstrumentDisplayName;
	}
	public void setInstrumentDisplayName(String instrumentDisplayName) {
		InstrumentDisplayName = instrumentDisplayName;
	}
	public Long getInstrumentID() {
		return InstrumentID;
	}
	public void setInstrumentID(Long instrumentID) {
		InstrumentID = instrumentID;
	}
	public Long getInstrumentTypeID() {
		return InstrumentTypeID;
	}
	public void setInstrumentTypeID(Long instrumentTypeID) {
		InstrumentTypeID = instrumentTypeID;
	}
	public String getSymbolFull() {
		return SymbolFull;
	}
	public void setSymbolFull(String symbolFull) {
		SymbolFull = symbolFull;
	}
	
	
}
