package com.example.democicd.democicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoCicdApplication {

    @GetMapping("/welcome")
    public String Welcome(){
        return "Welcome to CICD with jenkins";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoCicdApplication.class, args);
    }

}
