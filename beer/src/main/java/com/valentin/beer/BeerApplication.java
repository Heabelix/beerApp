package com.valentin.beer;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.sql.DataSource;

@SpringBootApplication(scanBasePackages = {"com.valentin.beer"})
@Configuration
public class BeerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeerApplication.class, args);
    }

}
