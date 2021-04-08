package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


//@EntityScan(basePackages = {"com.example.demo"})
//@SpringBootApplication(scanBasePackages = "com.example.demo")
//@EnableJpaRepositories(basePackages = {"com.example.demo.repository"})
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)

@SpringBootApplication(scanBasePackages = {"com.example.demo"})
@EnableJpaRepositories
@EntityScan
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

}
