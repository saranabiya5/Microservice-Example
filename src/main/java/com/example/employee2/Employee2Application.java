package com.example.employee2;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;
//import org.springframework.cloud.openfeign.FeignAutoConfiguration;

@SpringBootApplication
@EnableFeignClients
@EnableCaching
public class Employee2Application {

	public static void main(String[] args) {
		SpringApplication.run(Employee2Application.class, args);
	}

}
