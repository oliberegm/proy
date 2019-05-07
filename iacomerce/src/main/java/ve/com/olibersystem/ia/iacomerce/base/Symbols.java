package ve.com.olibersystem.ia.iacomerce.base;

import java.util.ArrayList;
import java.util.List;

import ve.com.olibersystem.ia.iacomerce.event.IValoresListener;

public class Symbols{
	
	private List<IValoresListener> symbolsListeners;
	
	private List<String> symbols;
	private int basetam;
	public Symbols() {
		
		symbolsListeners = new ArrayList<>();
		symbols = new ArrayList<>();
	}
	
	public void addSymbolsListener(IValoresListener s) {
		this.symbolsListeners.add(s);
	}
	
	public void information() {
		
	}
	
	private void generador(int tam, String base) {		
		if(tam >= this.basetam) {
			this.creargrupo(base);
		}else {
			
				generador(tam+1, base+"-");
			
			for(int i = 0; i< 26; i++) {
				generador(tam+1, base+String.valueOf((char) ('A' + i )));
			}
			for(int i = 0; i< 10; i++) {
				generador(tam+1, base+String.valueOf((char) ('0' + i )));
			}
			
		}
			
	}
	
	
	private void creargrupo(String base) {
		for(int i = 0; i< 26; i++) {
			symbols.add(base+String.valueOf((char) ('A' + i )));
		}
		for(int i = 0; i< 10; i++) {
			symbols.add(base+String.valueOf((char) ('0' + i )));
		}
	}
	
	public String[] listado(int iteraccion) {		
		this.basetam = iteraccion;
		this.generador(1, "");
		String []r = new String[symbols.size()];
		r = symbols.toArray(r);
		return r;
	}
	
	
	
	

}
