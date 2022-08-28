package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


//@Controller //to be able to return get,put,post,delete method
//@ResponseBody // to be able to response with json,xml or other type of file for client 

@RestController // combination of response body and controller annotation 
public class HelloWorldController {
	
	@GetMapping("message") //http method
	//default url http:localhost:8083/<endpoint>
	public Message getMessage() {
		//return "Hello World";
		return new Message("description", "comment");
	}

	@GetMapping("messages")
	public List<Message> getMesseges(){
		List<Message> messages = new ArrayList<>();
			messages.add(new Message("hi1", "hello2"));
		
			messages.add(new Message("dis is decription2", "this is comment2"));

			messages.add(new Message("dis is decription3", "this is comment3"));
			return messages;
	}

@GetMapping("{desc}/{cmt}")
	public Message messagePathVar(@PathVariable("desc") String desc,@PathVariable("cmt")String cmt){
		return new Message(desc, cmt);
	}
}
