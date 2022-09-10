package com.itc.main;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import com.itc.main.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.itc.main.repository.UserRepository;
@SpringBootApplication
@EnableEurekaClient
public class AccountManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountManagerApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	


}


