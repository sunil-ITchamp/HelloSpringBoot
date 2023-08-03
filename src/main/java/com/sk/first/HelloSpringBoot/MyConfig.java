package com.sk.first.HelloSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public StringBuffer stringBuffer(){
        return new StringBuffer("Hello");
    }
}
