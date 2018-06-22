package com.zkw.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1Controller {

	@RequestMapping(value="/hello")
	public String Hello(){
		return "Hello Spring Boot";
	}
}
