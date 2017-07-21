package com.aces.learn.spring.eureka.client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringEurekaClient1Application {
	/**
	 * 
	 * @return
	 */
	@LoadBalanced
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaClient1Application.class, args);
	}
}
