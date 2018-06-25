package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}
}
