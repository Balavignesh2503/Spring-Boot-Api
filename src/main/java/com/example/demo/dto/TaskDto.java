package com.example.demo.dto;

public class TaskDto {
	private long id;
	private String description;
	private boolean completed;
	public TaskDto() {
		
	}
	
	public TaskDto(long id, String description, boolean completed) {
		this.id = id;
		this.description = description;
		this.completed = completed;
	}
	public long getId() {
		return this.id;
	}
	public String getDescription() {
		return this.description;
	}
	public boolean getCompleted() {
		return this.completed;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	

}
