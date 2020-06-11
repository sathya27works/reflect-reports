package com.reflect.reports.reflectreports;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.reflect"})
public class ReflectReportsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReflectReportsApplication.class, args);
	}

}
