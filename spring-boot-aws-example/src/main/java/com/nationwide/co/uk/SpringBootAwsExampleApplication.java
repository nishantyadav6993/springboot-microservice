package com.nationwide.co.uk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAwsExampleApplication {

	@GetMapping("/HelloSpeedLayer")
	public String home(){
		return "Welcome Nishant to the world of Speed layer...!!!";
	}
	public static void main(String[] args) {SpringApplication.run(SpringBootAwsExampleApplication.class, args);}

}
