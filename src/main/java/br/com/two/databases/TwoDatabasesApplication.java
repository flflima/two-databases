package br.com.two.databases;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "br.com.two.databases.model" })
public class TwoDatabasesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwoDatabasesApplication.class, args);
	}
}
