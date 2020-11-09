package com.project.Emiclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude= {SecurityAutoConfiguration.class})


public class EmiclassPiApplication  {
	public static void main(String[] args) {
		SpringApplication.run(EmiclassPiApplication.class, args);
	}

}
