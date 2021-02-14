package com.nationwide.co.uk.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.nationwide"})
public class SprigBootAccountDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprigBootAccountDetailsApplication.class, args);
	}

}
