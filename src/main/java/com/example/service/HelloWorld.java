package com.example.service;

import javax.jws.WebService;

@WebService
public class HelloWorld{
	
	public String sayHi(String hello) {
		
		
		return "Hello "+hello;
		
	}
	
	
	public int add(int a, int b) {
		return a+b;
	}

}