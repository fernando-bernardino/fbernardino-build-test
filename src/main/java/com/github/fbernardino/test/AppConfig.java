package com.github.fbernardino.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan(basePackages = {"com.github.fbernardino.test"})
@EnableAutoConfiguration
@PropertySource("classpath:application.yml")
public class AppConfig {
	
    public static void main(String[] args) throws Exception {
        SpringApplication.run(AppConfig.class, args);
    }
}
