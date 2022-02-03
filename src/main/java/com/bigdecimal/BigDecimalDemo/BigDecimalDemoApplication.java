package com.bigdecimal.BigDecimalDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bigdecimal.BigDecimalDemo.model.NumbersJpaRepository;

@SpringBootApplication
public class BigDecimalDemoApplication {

	@Autowired
	NumbersJpaRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(BigDecimalDemoApplication.class, args);
	}

}
