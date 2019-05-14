package ve.com.olibersystem.bursatil.models.etoro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WebDataTimer {
	private Date horaConsulta1;
	private Date horaConsulta2;
	private Date horaConsulta3;
	
	private InstrumentsWebData data1;
	private InstrumentsWebData data2;
	private InstrumentsWebData data3;
	public List<Rate> getPrecio(Long idSymbol) {
		List<Rate> r = null;
		if(data1 != null && data2 != null && data3 != null) {
			r = new ArrayList<>();
			r.add(data1.getRates().stream()
				.filter(rate -> idSymbol.equals(rate.getInstrumentID()))
				.findAny()
				.orElse(null));
			r.add(data2.getRates().stream()
					.filter(rate -> idSymbol.equals(rate.getInstrumentID()))
					.findAny()
					.orElse(null));
			r.add(data3.getRates().stream()
					.filter(rate -> idSymbol.equals(rate.getInstrumentID()))
					.findAny()
					.orElse(null));
		}
		return r;	
	}
	public void addInstrumentsWebData(InstrumentsWebData data) {
		if(data2 != null) {
			data3 = data2;
		}
		if(data1 != null) {
			data2 = data1;
		}
		data1 = data;
	}
	public Date getHoraConsulta1() {
		return horaConsulta1;
	}
	public void setHoraConsulta1(Date horaConsulta1) {
		this.horaConsulta1 = horaConsulta1;
	}
	public Date getHoraConsulta2() {
		return horaConsulta2;
	}
	public void setHoraConsulta2(Date horaConsulta2) {
		this.horaConsulta2 = horaConsulta2;
	}
	public Date getHoraConsulta3() {
		return horaConsulta3;
	}
	public void setHoraConsulta3(Date horaConsulta3) {
		this.horaConsulta3 = horaConsulta3;
	}
	public InstrumentsWebData getData1() {
		return data1;
	}
	public void setData1(InstrumentsWebData data1) {
		this.data1 = data1;
	}
	public InstrumentsWebData getData2() {
		return data2;
	}
	public void setData2(InstrumentsWebData data2) {
		this.data2 = data2;
	}
	public InstrumentsWebData getData3() {
		return data3;
	}
	public void setData3(InstrumentsWebData data3) {
		this.data3 = data3;
	}
	
	
	
}
