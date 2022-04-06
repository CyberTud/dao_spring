package com.example.demo;

import com.example.demo.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Customer customer = Customer.builder().id(1).username("Tudor").city("London").country("UK").build();

	}
}
