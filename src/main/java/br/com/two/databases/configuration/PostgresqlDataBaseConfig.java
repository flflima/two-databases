package br.com.two.databases.configuration;

//Omitindo classe de configuração
//@Configuration
//@EnableJpaRepositories(basePackages = "br.com.two.databases.repository",
//						entityManagerFactoryRef = "postgresqlEntityManager")
public class PostgresqlDataBaseConfig {
	
//	@Bean
//	@ConfigurationProperties("postgresql.datasource")
//	public DataSource postgresqlDataSource() {
//	    return DataSourceBuilder.create().build();
//	}
//
//	@Bean(name = "postgresqlEntityManager")
//	public LocalContainerEntityManagerFactoryBean postgresqlEntityManager(
//	        EntityManagerFactoryBuilder builder) {
//	    return builder
//	            .dataSource(postgresqlDataSource())
//	            .persistenceUnit("endereco")
//	            .packages("br.com.two.databases.model")
//	            .build();
//	}
}
