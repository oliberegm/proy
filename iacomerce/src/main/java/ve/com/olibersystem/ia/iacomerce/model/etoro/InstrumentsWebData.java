package ve.com.olibersystem.ia.iacomerce.model.etoro;

import java.util.List;
import java.util.Map;

public class InstrumentsWebData {
	private Map<Long, Boolean> InstrumentsToActivityState;
	private List<Rate> Rates;
	public List<Rate> getRates() {
		return Rates;
	}
	public void setRates(List<Rate> rates) {
		this.Rates = rates;
	}
	
	public Map<Long, Boolean> getInstrumentsToActivityState() {
		return InstrumentsToActivityState;
	}
	public void setInstrumentsToActivityState(Map<Long, Boolean> instrumentsToActivityState) {
		InstrumentsToActivityState = instrumentsToActivityState;
	}
}
