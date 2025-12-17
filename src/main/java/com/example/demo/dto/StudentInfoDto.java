package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"name","age","dept"})
public class StudentInfoDto {
	private String name;
	private String age;
	private String dept;
	
	public StudentInfoDto(String name, String age,String dept) {
		this.name = name;
		this.age = age;
		this.dept = dept;
		
	}
	public void setName(String name) {
		this.name = name ;
		
	}
	public String getName() {
		return this.name;		
	}
	public void setAge(String age) {
		this.age = age ;
		
	}
	public String getAge() {
		return this.age;		
	}
	public void setDept(String dept) {
		this.dept = dept ;
		
	}
	public String getDept() {
		return this.dept;		
	}

}
