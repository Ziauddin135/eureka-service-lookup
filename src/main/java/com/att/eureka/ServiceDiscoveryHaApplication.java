package com.att.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaServer
@ComponentScan(basePackages = "com.att.eureka")
public class ServiceDiscoveryHaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryHaApplication.class, args);
	}
}
