package com.poc.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.poc")
public class JwtPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtPocApplication.class, args);
    }
}
