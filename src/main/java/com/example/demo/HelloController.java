package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.*;


@RestController
public class HelloController {
	List<TaskDto> list = new ArrayList<>();
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
	
	@GetMapping("/gettask")
	public List<TaskDto> get(){
		return list;
	}
	private long idcount =0;
	@PostMapping("/newtask")
	public List<TaskDto> insert(@RequestBody TaskDto task){
		task.setId(idcount++);		
		list.add(task);
		return list;	
		
	}
	@GetMapping("/newtask")
	public List<TaskDto> newtask(@RequestParam("description") String description,@RequestParam("completed") boolean completed){
		TaskDto task = new TaskDto(idcount++,description,completed);
		list.add(task);
		return list;
	}
	@GetMapping("/updatetask")
	public List<TaskDto> updatetask(@RequestParam("id") long id ,@RequestParam("description") String description,@RequestParam("completed") boolean completed){
		for(TaskDto task : list) {
			if(task.getId()==id) {
				task.setDescription(description);
				task.setCompleted(completed);
			}
		}
		return list;
	}
	
	
	
	

}
