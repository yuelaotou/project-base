package com.hebaobei.baby.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.hebaobei.baby.mapper")
@ComponentScan({ "com.hebaobei.baby.service", "com.hebaobei.baby.web.controller", "com.hebaobei.baby.config" })
@EnableAutoConfiguration
public class SpringBootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}
}
