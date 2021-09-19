package com.example.selfintroapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.selfintroapp.mapper")
public class SelfintroAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SelfintroAppApplication.class, args);
	}

}
