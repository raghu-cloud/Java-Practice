package com.uttara.test;

public class TruckEngine implements Engin {
	public TruckEngine()
	{
		System.out.println("Inside no argument constructor  of the TruckEngine class");
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
		// TODO Auto-generated method stub
		return name;
	}

}
