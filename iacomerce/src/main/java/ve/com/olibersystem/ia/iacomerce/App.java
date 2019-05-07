package ve.com.olibersystem.ia.iacomerce;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@EnableJpaRepositories("ve.com.olibersystem.ia.iacomerce.repository.*")
@EntityScan("ve.com.olibersystem.ia.iacomerce.model")
@EnableAsync
public class App  {
	private static final Logger log = LoggerFactory.getLogger(App.class);
	public static void main(String[] args) {
		log.info("iniciando");
		SpringApplication.run(App.class, args);
		log.info("finalizando");
	}
}
/*
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			/*
			InstrumentoETORODTO eto = new InstrumentoETORODTO();
			eto.setId(Long.valueOf(1));
			eto.setIdReferencia(Long.valueOf(1));
			eto.setLabel("EUR/USD");
			eto.setSymbol("EURUSD");		
	        System.out.println(instrumentServices.guardarInstrumento(new InstrumentoDTO(EmpresasEnum.ETORO, eto)));*
			//String data = restTemplate.getForObject("https://api.etorostatic.com/sapi/instrumentsmetadata/V1.1/instruments?cv=e338281e435975a47483279a4ed21e09_d2d679188ebffc144cb5752f40672d27", String.class);
			String data2 = restTemplate.getForObject("https://api.etorostatic.com/sapi/trade-real/instruments?InstrumentDataFilters=TradingData&cv=758d89f4a3a8ba941635dd446cce9aad_fc8fb517d26e5ad2e33841ecf2ba7ebb", String.class);
			ObjectMapper mapper = new ObjectMapper();
			Gson gson = new Gson();
			//InstrumentDisplayDatas d = gson.fromJson(data, InstrumentDisplayDatas.class);
			InstrumentsWebData webEtoro = gson.fromJson(data2, InstrumentsWebData.class);
			instrumentServices.actualizarValores(webEtoro);
			
			
			//InstrumentDisplayDatas d = mapper.readValue(data, InstrumentDisplayDatas.class);
			//InstrumentDisplayDatas data = restTemplate.getForObject("https://api.etorostatic.com/sapi/instrumentsmetadata/V1.1/instruments?cv=e338281e435975a47483279a4ed21e09_d2d679188ebffc144cb5752f40672d27", InstrumentDisplayDatas.class);
			
//			log.info("Resultado: "+d.getInstrumentDisplayDatas().size(), d);
//			instrumentServices.guardarInstrumentoEtoro(d);
//			log.info("cargando los de yahoo");
//			instrumentServices.guardarInstrumentoYahoo();
//			log.info("finalizar");
//			System.exit(0);
		};
	}
	
	private Map<String, Double> mezclar(InstrumentDisplayDatas claves, InstrumentWebEtoro webEtoro){
		Map<String, Double> data = new HashMap<>();
		for(InstrumentDisplayData ds : claves.getInstrumentDisplayDatas()) {
			for(InstrumentWebEtoro we : webEtoro.getDatos()) {
				if(ds.getInstrumentID() == we.getInstrumentID()) {
					data.put(ds.getSymbolFull(), we.get)
				}
			}
		}
		return data;
//		Ask: 1.1524
//		Bid: 1.1521
//		ConversionRateAsk: 1
//		ConversionRateBid: 1
//		Date: "2018-10-05T19:53:59.4578569Z"
//		InstrumentID: 1
//		LastExecution: 1.15232
//		UnitMargin: 1.1521
//		UnitMarginAsk: 1.1524
//		UnitMarginBid: 1.1521
	}
	
	
}


/*extends Thread implements Runnable, CommandLineRunner {
	@Autowired
	DataSource dataSource;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
	public void run() {
		//this.soloBitcoin();
		muchasOpciones();
	}
	
	public void muchasOpciones() {
		int i =0;
		int cambios = 0;
		Perceptron p = new Perceptron(5);
		while(cambios < 5) {
			
		 	try {
				p.addEntradas(YahooFinance.get(new Symbols().listado(2)));
				
				Thread.sleep(3000);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cambios++;
		}
		System.out.println(p);   
	}
	
	
	public void soloBitcoin() {
		Perceptron p = new Perceptron(5);				
		int cambios = 0, i =0;
		BigDecimal priceold = new BigDecimal(0); 
		while(cambios<10) {
			Stock stock;
			try {
				Calendar from = Calendar.getInstance();
				Calendar to = Calendar.getInstance();
				from.set(2018,1,1);				
				to.set(2018,5,17);
				
				
				stock = YahooFinance.get("BTC-USD", from, to);
				BigDecimal price = stock.getQuote().getPrice();
				
				if(!price.equals(priceold)) {
					priceold = price;
					System.out.println("Precio: "+i+" ==>> "+price);
					cambios++;
					Map<String, Stock> a = new HashMap<>();
					a.put("BTC-USD", stock);
					p.addEntradas(a);
				}
				i++;
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
		}
		System.out.println(p);
	}
	public void etoro() throws ClientProtocolException, URISyntaxException, IOException {
		ManagerTransaction etoro = new ManagerTransaction();
		etoro.consultarTransacciones();
	}
	
	
   public static void main( String[] args ) throws IOException, InterruptedException, URISyntaxException
   {
	   new App().etoro();
    	//new App().start();
//	   Valores v = new Valores("BTC-USD");
//	   for(int i = 0; i< 20; i++) {
//		   System.out.println( v.getStockYahoo().getQuote().getPrice());
//		   Thread.sleep(1000);
//	   }
	   //Map<String, Stock> res =  YahooFinance.get(new Symbols().listado(1));
	   //System.out.println(res.size());
	   
//	   
//	   
    	
    	
    	
    }
}*/
