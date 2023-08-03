package com.sk.first;

import com.sk.first.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@SpringBootApplication
@Lazy
public class HelloSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}

@RestController
class Greet{
	@Autowired
	private StringBuffer stringBuffer;

	@Autowired
	private HelloService helloService;

	@GetMapping("/greet")
	public String greet(@RequestParam String name){
		String msg = stringBuffer.substring(0,5);
		return msg + " " + name + helloService.doService();
	}
}
