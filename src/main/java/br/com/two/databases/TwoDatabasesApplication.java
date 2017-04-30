package br.com.two.databases;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "br.com.two.databases.repository" })
public class TwoDatabasesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwoDatabasesApplication.class, args);
	}

	@Bean
	@Primary
	@ConfigurationProperties("mysql.datasource")
	public DataSource mysqlDataSource() {
	    return DataSourceBuilder.create().build();
	}

	@Bean(name = "mysqlEntityManager")
	@Primary
	public LocalContainerEntityManagerFactoryBean mysqlEntityManager(
	        EntityManagerFactoryBuilder builder) {
	    return builder
	            .dataSource(mysqlDataSource())
	            .persistenceUnit("nome")
	            .packages("br.com.two.databases.model")
	            .build();
	}
	
	@Bean
	@ConfigurationProperties("postgresql.datasource")
	public DataSource postgresqlDataSource() {
	    return DataSourceBuilder.create().build();
	}

	@Bean(name = "postgresqlEntityManager")
	public LocalContainerEntityManagerFactoryBean postgresqlEntityManager(
	        EntityManagerFactoryBuilder builder) {
	    return builder
	            .dataSource(postgresqlDataSource())
	            .persistenceUnit("endereco")
	            .packages("br.com.two.databases.model")
	            .build();
	}
}
