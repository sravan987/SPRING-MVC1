package com.example.spring.jdbc;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource(value = { "classpath.db.properties" })
public class Config {
	@Value("${db.oracle.user}")
	private String user;
	@Value("${db.oracle.password}")
	private String password;
	@Value("${db.oracle.url}")
	private String url;
	@Bean
	public DataSource getDataSource() {
		BasicDataSource ds=new BasicDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl(url);
		ds.setUsername(user);
		ds.setPassword(password);
		
		
		return ds;
	}
	@Bean
	public JdbcTemplete getJdbcTemplete(){
		JdbcTemplete template=new JdbcTemplete();
		templete.setDataSource(getDataSource());
		return templete;
}
	@Bean
	public static PropertyPlaceholderConfigurer getProperties() {
		return new PropertyPlaceholderConfigurer();
		
}
}