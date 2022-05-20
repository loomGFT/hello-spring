package com.example.hellospring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloSpringApplication {

    private static final Logger log = LoggerFactory.getLogger(HelloSpringApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(HelloSpringApplication.class, args);
    }

    @RequestMapping("/hello")
    String hello(){
        log.info("Calling hello method");
        return "Hello, World!";
    }

    @RequestMapping("/bye")
    String bye(){
        log.info("Calling bye method");
        return "Bye bye";
    }


}
