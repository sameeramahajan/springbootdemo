package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.service.HelloService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		HelloService helloService = context.getBean("helloService", HelloService.class);
		System.out.println(helloService.helloworld("Sameera"));
		System.out.println(context.getBeanDefinitionCount());
	}
}
