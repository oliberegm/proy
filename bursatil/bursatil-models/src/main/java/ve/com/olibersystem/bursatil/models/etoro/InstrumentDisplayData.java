package ve.com.olibersystem.bursatil.models.etoro;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity()
@Table(name = "instrument_data_etoro")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("unused")
public class InstrumentDisplayData {
	
	private Long ExchangeID;
	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
	//private List<Images> Images;
	private String InstrumentDisplayName;
	@Id
	private Long InstrumentID;
	private Long InstrumentTypeID;
	private String SymbolFull;
	
	
}
