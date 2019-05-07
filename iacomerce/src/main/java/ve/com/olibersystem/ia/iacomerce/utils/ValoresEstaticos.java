package ve.com.olibersystem.ia.iacomerce.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ValoresEstaticos {
	public static final long SEGUNDOS_RECARGA_PETICONES = 1500;
	
	public static final String ETORO_PETICION_DATOS = "https://www.etoro.com/sapi/trade-real/instruments/?InstrumentDataFilters=Activity,Rates&client_request_id=2f363efb-39e4-44de-81d9-221793372eee";
	public static final String ETORO_PETICION_INICIALIZAR = "https://api.etorostatic.com/sapi/instrumentsmetadata/V1.1/instruments?cv=5e8db4053cccfb09c2c9ac3ea7cc7d45_e979059b0b4392cb2d4d2aaae4b2";
	
	public static final String RUTA_ARCHIVOS = "c:\\apps\\";
	
	public static String formatoFecha(Date fecha) {
		SimpleDateFormat formateador = new SimpleDateFormat("yy/MM/dd");
		return  formateador.format(fecha);
	}
}
	