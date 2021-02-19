package com.demo.LoanStreet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoanStreetApp {

	private static final Logger log = LoggerFactory.getLogger(LoanStreetApp.class);

	public static void main(String[] args) {
		SpringApplication.run(LoanStreetApp.class, args);
	}

}
