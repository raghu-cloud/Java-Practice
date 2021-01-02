package xmlConfiguration;


public class Juggler implements Performer {
	private int numOfBags=3;
	String name;
	public int getNumOfBags() {
		return numOfBags;
	}
	public void setNumOfBags(int numOfBags) {
		this.numOfBags = numOfBags;
	}
	public Juggler(int n)
	{
		System.out.println("Inside Juggler Constructor");
		numOfBags=n;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void perform() throws PerformanceException{
		System.out.println("I  am juggler with name "+name+" juggling "+numOfBags+" bags");
		
	}

}
