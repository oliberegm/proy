package ar.com.redlink.configurador.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactory", basePackages = {
		"ar.com.redlink.configurador.dao" })
public class DbUsrHomebConfig {
	@Value("${redlink.framework.persistence.datasource.driverClassName}")
	private String JDBC_DRIV;
	@Value("${redlink.framework.persistence.datasource.url}")
	private String JDBC_URLL;
	@Value("${redlink.framework.persistence.datasource.username}")
	private String JDBC_USER;
	@Value("${redlink.framework.persistence.datasource.password}")
	private String JDBC_PASS;

	@Primary
	@Bean(name = "dataSource")
	public DataSource dataSource() {
		System.out.println("*******************************");
		System.out.println(JDBC_DRIV);
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(JDBC_DRIV);
		dataSource.setUrl(JDBC_URLL);
		dataSource.setUsername(JDBC_USER);
		dataSource.setPassword(JDBC_PASS);
		return dataSource;
	}

//	@Bean
//	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//		vendorAdapter.setDatabase(Database.ORACLE);
//		vendorAdapter.setGenerateDdl(true);
//
//		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
//		factory.setJpaVendorAdapter(vendorAdapter);
//		factory.setPackagesToScan(getClass().getPackage().getName());
//		factory.setDataSource(dataSource());
//
//		return factory;
//	}
//
//	@Bean
//	@Autowired
//	public JpaTransactionManager transactionManager() {
//		JpaTransactionManager txManager = new JpaTransactionManager();
//		txManager.setEntityManagerFactory(entityManagerFactory().getObject());
//
//		return txManager;
//	}
}
