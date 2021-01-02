package com.uttara.test;

public class Car {
	String name;
	int bhp;
	Engin eng;
	public void drive()
	{
		
		System.out.println("I am Car with name "+name+" and with bhp "+bhp+" driving with Engine "+eng.tellName());
	}
	
	public Engin getEng() {
		return eng;
	}
	public void setEng(Engin eng) {
		this.eng = eng;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBhp() {
		return bhp;
	}
	public void setBhp(int bhp) {
		this.bhp = bhp;
	}
	public Car()
	{
	    System.out.println("Inside no arg constructor of Car");
	}
	
	public Car(String n,int id,Engin e)
	{
		this.name=n;
		this.bhp=id;
		this.eng=e;
		System.out.println("Inside parameterized constructor of Car");
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", bhp=" + bhp + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bhp;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (bhp != other.bhp)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
