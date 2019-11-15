package com.asjy.redi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RediApplication {

    public static void main(String[] args) {
        SpringApplication.run(RediApplication.class, args);
    }

}
