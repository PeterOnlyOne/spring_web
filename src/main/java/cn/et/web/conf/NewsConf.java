package cn.et.web.conf;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
public class NewsConf {

	@Value("${url}")
	private String url;
	@Value("${driverClass}")
	private String driverClassName;
	@Value("${usernames}")
	private String username;
	@Value("${password}")
	private String password;
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource){
		return new JdbcTemplate(dataSource);
	}
	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dSource = new DriverManagerDataSource();
		dSource.setUrl(url);
		dSource.setDriverClassName(driverClassName);
		dSource.setUsername(username);
		dSource.setPassword(password);
		return dSource;
	}
}
