package com.intuit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//http://localhost:8080/hello

@Controller
public class HelloController {

	//http://localhost:8080/print?name=Sam&age=12
	@PostMapping("/print") 
	@ResponseBody
	public String printInfo(@RequestParam("name") String name, 
			@RequestParam("age") int age) {
		return "Name: " + name + ", Age: " + age;
	}
	
	@PostMapping("/bye/{name}")
	@ResponseBody
	public String sayBye(@PathVariable("name") String name) {
		return  "Bye Bye " + name;
	}
	
	@GetMapping("/hi/{name}")
	@ResponseBody
	public String greet(@PathVariable("name") String name) {
		return "Hi " + name;
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello Spring Boot";
	}
}
