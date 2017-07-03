package com.xinlian.baby.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan({"com.xinlian.baby.service", "com.xinlian.baby.web.controller" })
@MapperScan("com.xinlian.baby.mapper")
@PropertySource({ "classpath:application.properties", "classpath:important.properties" })
public class SpringBootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}
}
