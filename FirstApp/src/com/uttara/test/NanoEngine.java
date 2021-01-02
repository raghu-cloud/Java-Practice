package com.uttara.test;

public class NanoEngine implements Engin {
	public NanoEngine() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside no argument constructor  of the NanoEngine class");
	}
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String tellName() {
		return name;
	
		
	}


	
}
