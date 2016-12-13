package com.innogames.igjam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.innogames.igjam")
public class Application {

	@SuppressWarnings("squid:S2095")
	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(Application.class, args);
	}
}
