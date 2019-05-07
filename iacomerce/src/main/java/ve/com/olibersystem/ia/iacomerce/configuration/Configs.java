package ve.com.olibersystem.ia.iacomerce.configuration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import ve.com.olibersystem.ia.iacomerce.model.etoro.WebDataTimer;

@Configuration
public class Configs {
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Bean
	public WebDataTimer webDataTimer() {
		return new WebDataTimer();
	}
}
