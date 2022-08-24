package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//@Controller //to be able to return get,put,post,delete method
//@ResponseBody // to be able to response with json,xml or other type of file for client 

@RestController // combination of response body and controller annotation 
public class HelloWorldController {
	
	@GetMapping("hello-world") //http method
	//default url http:localhost:8083/<endpoint>
	public String helloWorld() {
		return "Hello World";
	}
}
