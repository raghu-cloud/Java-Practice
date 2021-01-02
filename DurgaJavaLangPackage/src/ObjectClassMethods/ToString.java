package ObjectClassMethods;

public class ToString {
	String name;
	ToString(String s)
	{
		this.name=s;
	}
	public String toString()
	{
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToString t=new ToString("Durga");
		System.out.println(t);

	}

}
