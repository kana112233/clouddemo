package com.example.testclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class TestclientApplication {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String test(){
        String forObject = restTemplate.getForObject("http://CLIENT/hello", String.class);
        return forObject;
    }

    public static void main(String[] args) {
        SpringApplication.run(TestclientApplication.class, args);
    }

}
