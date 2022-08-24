package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {
	@GetMapping("data")
	public String returnData() {
		return "Sample text data";
	}
	

}
