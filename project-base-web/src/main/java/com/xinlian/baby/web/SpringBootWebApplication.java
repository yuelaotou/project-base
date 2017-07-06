package com.xinlian.baby.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.xinlian.baby.mapper")
@ComponentScan({ "com.xinlian.baby.service", "com.xinlian.baby.web.controller", "com.xinlian.baby.config" })
@EnableAutoConfiguration
public class SpringBootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}
}
