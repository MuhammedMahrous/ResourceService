package com.mahrous.resourceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableResourceServer
public class ResourceServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(ResourceServiceApp.class,args);
    }
}
