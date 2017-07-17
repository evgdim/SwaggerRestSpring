package com.github.evgdim.swaggerrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SwaggerRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerRestApplication.class, args);
	}
	
	@Bean
	@ConfigurationProperties(prefix="my")
	public DataSource props(){
		return new DataSource();
	}
}
