package com.example.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.domain.Greeting;

@RestController
public class HelloWorlController {

	@RequestMapping("/hello")
	public String printHelloWorld() {
		return "Hello World !!";	
	}
	
	@RequestMapping(value = "/greetings")
	Object Hello() {
		return new Greeting("Hello World");
	}
}
