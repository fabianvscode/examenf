package com.fabian.adminuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableAutoConfiguration
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class AdminuserApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminuserApplication.class, args);
	}

}
