package com.example.insuranceclientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope

public class InsuranceClientDemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(InsuranceClientDemoApplication.class, args);
	}

}
