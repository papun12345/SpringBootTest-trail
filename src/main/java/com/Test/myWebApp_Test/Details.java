package com.Test.myWebApp_Test;

public class Details 
{
	
	String name;
	int age;
	String email;
	public Details(String name,String email,int age) {
		super();
		this.age = age;
		this.name = name;
		this.email=email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
