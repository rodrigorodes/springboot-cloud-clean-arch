package br.com.rodslab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableFeignClients
@EnableEurekaClient
@EnableResourceServer
@SpringBootApplication
public class RatingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingApiApplication.class, args);
	}
	
	

}
