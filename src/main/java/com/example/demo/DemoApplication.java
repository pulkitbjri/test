package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Configuration
@EnableJpaRepositories
@SpringBootApplication
public class DemoApplication {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
