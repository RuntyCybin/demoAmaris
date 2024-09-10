package com.amaris.demoAmaris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ComponentScan({"com.amaris.demoAmaris.service"})
@EntityScan({"com.amaris.demoAmaris.model"})
@EnableJpaRepositories(basePackages = "com.amaris.demoAmaris.repository")
public class DemoAmarisApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoAmarisApplication.class, args);
	}

}
