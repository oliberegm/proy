package ar.com.redlink.configurador.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class SpringWebInicializador implements WebApplicationInitializer{
	
	public void onStartup(ServletContext contenerdor) throws ServletException {
		AnnotationConfigWebApplicationContext contexto = new AnnotationConfigWebApplicationContext();
		contexto.register(WebMvcConfig.class);
		contexto.setServletContext(contenerdor);
		
		ServletRegistration.Dynamic servlet = contenerdor.addServlet("dispacher", new DispatcherServlet(contexto));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
		
		
	};

}
