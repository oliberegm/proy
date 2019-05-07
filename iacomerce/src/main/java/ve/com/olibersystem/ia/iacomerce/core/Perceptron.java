package ve.com.olibersystem.ia.iacomerce.core;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import yahoofinance.Stock;

public class Perceptron {
	private Map<String, List<Stock>> historicos;
	private int profundidad;
	
	private List<Double> pesos;
	private Random rnd;
	private int resp;
	private List<Double> entradas;
	private double umbral;
	private final int futuro = 3;
	
	private Map<String, Stock> historico1;
	private Map<String, Stock> historico2;
	private Map<String, Stock> historico3;
	
	private Map<String, List<List<BigDecimal>>> cambios;
	
	private Map<String, Integer> cambio1;
	private Map<String, Integer> cambio2;
	private Map<String, Integer> cambio3;

	public Perceptron(int profundidad) {
		this.profundidad = profundidad;
		historicos = new HashMap<>();
		cambios = new HashMap<>();
		
		
		pesos = new ArrayList<>();
		rnd = new Random();
		resp = 1;
		cambio1 = new HashMap<>();
		cambio2 = new HashMap<>();
		cambio3 = new HashMap<>();
	}
	
	public void setProfundidad(int profundidad) {
		this.profundidad = profundidad;
	}
	public int getProfundidad() {
		return profundidad;
	}
	
	public int respuesta() {
		return resp;
	}
	
	public void addEntradas(Map<String, Stock> entrada) {
		entrada.forEach((k,v)->{
				List<Stock> l = (historicos.get(k) == null) ? new ArrayList<>(): historicos.get(k);
				l.add(v);
				historicos.put(k, l);
			});
		this.obtenerCambios();
	}
	private Stock actual;
	private Stock anterior;	
	public void obtenerCambios() {
		actual = anterior = null;
		Map<String, List<BigDecimal>> temp = new HashMap<>();
		if(historicos.size() > 0) {
			historicos.forEach((k,v)->{
				v.forEach(action->{
					anterior = action;
					if(actual != null) {						
						List<BigDecimal> l = (temp.get(k) == null) ? new ArrayList<>(): temp.get(k);
						l.add(actual.getQuote().getPrice().subtract(anterior.getQuote().getPrice()));
						temp.put(k, l);
					}
					actual = anterior;
				});
			});
			
			temp.forEach((k,v)->{
				List<List<BigDecimal>> l = (cambios.get(k) == null)? new ArrayList<>(): cambios.get(k);
				l.add(v);
				cambios.put(k, l);
			});
		}		
	}

	public void entrenadora(int esperado) {		
		if(esperado != this.respuesta()) {
			cambiarPesos();
		}
	}
	private void cambiarPesos() {
		
	}
	
	
	public void crearSinaptis() {
		pesos.add(rnd.nextDouble());
	}
	
	private void exitadora() {
		double calcular = 0;
		for (Double double1 : pesos) {
			
		}
	}
	String sa;
	@Override
	public String toString() {	
		sa = "";
		cambios.forEach((k,v)->{
			sa += k+": \n";
			v.forEach(action->{
				action.forEach(action2->{
					sa += action2+"\t";
				});
				sa+="\n";
			});			
		});
		return sa;
	}
	
}
