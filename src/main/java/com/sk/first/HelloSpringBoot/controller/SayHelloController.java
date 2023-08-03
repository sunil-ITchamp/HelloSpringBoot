package com.sk.first.HelloSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SayHelloController {

    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/")
    public String sayHello()
    {

        //String message = restTemplate.getForObject("http://MYEUREKACLIENT/home", String.class);
        return "Hello from SB Controller !!";
    }
}
