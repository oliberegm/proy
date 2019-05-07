package ar.com.redlink.configurador.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages ="ar.com.redlink.configurador.*")
//@PropertySource("classpath:/app.properties")
@PropertySource(value = "classpath:/properties/datasource.properties", ignoreResourceNotFound = true)
public class WebMvcConfig {
	
   
}
