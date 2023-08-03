package com.sk.first.service;


import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String doService(){
        System.out.println("Service is being called");
        return "service call";
    }
}
