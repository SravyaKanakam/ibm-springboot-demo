package com.ibm.springboot.demo.controller;

//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@Component
@RestController
@RequestMapping("hello")
public class HelloController 
{
	//@RequestMapping("hi")
	@GetMapping("/get-data")
	public String hi()
	{
		System.out.println("hello!");
		return "hello world!";
	}
	@GetMapping("/buu")
	public String hi2()
	{
		System.out.println("hello2!");
		return "hello world2!";
	}
	

}
