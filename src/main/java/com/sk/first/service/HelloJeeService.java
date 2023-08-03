package com.sk.first.service;


import org.springframework.stereotype.Service;

@Service
public class HelloJeeService {

    public String doService(){
        System.out.println("HelloJeeService is being called");
        return "helloJee service call";
    }
}
