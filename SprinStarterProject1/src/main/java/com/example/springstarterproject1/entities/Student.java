package com.example.springstarterproject1.entities;

import org.springframework.stereotype.Component;

@Component
public class Student {
private int id;
private String name;
	
	public Student() {
		super();
		System.out.println("Student");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void display()
	{
		System.out.println("Hello Students");
	}
}
