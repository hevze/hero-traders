package com.hero.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HeroRegisterCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeroRegisterCenterApplication.class, args);
	}

}
