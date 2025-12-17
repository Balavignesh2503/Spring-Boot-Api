package com.example.demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.*;


@RestController
public class HelloController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
	
	@GetMapping("/student/{name}")
	public String getName(@PathVariable("name") String name) {
		return "Student name is : "+name;
	}
	@GetMapping("/student/age")
	public String age(@RequestParam("value") String age) {
		return age;
	}
	@GetMapping("/student/info/{name}")
	public StudentInfoDto info(@PathVariable("name") String name, @RequestParam("age") String age,@RequestParam("dept") String dept){
		
		
		return new StudentInfoDto(name,age,dept);
	}
	

}
