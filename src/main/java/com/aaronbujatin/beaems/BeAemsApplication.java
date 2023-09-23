package com.aaronbujatin.beaems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@SpringBootApplication
public class BeAemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeAemsApplication.class, args);
	}

}