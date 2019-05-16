package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service("helloService")
@RestController
public class HelloService {
	
	@RequestMapping("/")
	public String helloworld(String name) {
		return "Hello.. Demo on CI/CD pipeline";
	}
}
