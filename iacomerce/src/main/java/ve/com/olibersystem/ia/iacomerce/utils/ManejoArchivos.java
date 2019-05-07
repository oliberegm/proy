package ve.com.olibersystem.ia.iacomerce.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ManejoArchivos {
	public static void guardarTransaccion(String trans, String datos) {
		try {
			FileWriter  file = new FileWriter(ValoresEstaticos.RUTA_ARCHIVOS+trans+".txt", true);
			BufferedWriter bw = new BufferedWriter(file);
			bw.write(datos+"\n");
			bw.close();
			file.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		
		
	}

}
