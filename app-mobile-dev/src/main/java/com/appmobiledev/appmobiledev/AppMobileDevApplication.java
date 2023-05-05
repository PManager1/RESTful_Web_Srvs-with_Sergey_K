package com.appmobiledev.appmobiledev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AppMobileDevApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppMobileDevApplication.class, args);
	}

}
