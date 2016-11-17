package com.github.fbernardino.test;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping(value = "{name}")
	public Hello sayHello(@PathVariable String name){
		
		return new Hello(name);
	}

}
