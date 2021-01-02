package AnyPractice;

public class RaceCar extends Car {
	String state="2 hyderabad";
	String welcome()
	{
		return "India Welcome u";
	}
	String getMe()
	{
		return this.state;
	}
	
	
	public static void main(String[] args)
	{
		Car car=new Car();
		Car raceCar=new RaceCar();
		
	}

}
