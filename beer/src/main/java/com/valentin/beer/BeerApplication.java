package com.valentin.beer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages = {"com.valentin.beer"})
@Configuration
public class BeerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeerApplication.class, args);
    }

}
