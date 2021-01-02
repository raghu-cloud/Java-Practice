package uttara.exception.practice;

public class Test {
	public void ex() {
		
	}
	public static void main(String[] args)
	{
		try
		{
			String str=null;
			str.charAt(0);
			
		}
		catch(Throwable t) {
			t.fillInStackTrace();
			System.out.println(t);
			System.out.println("Inside catch block");
			
		}
		
		System.out.println("At the end of the main");
	}
}

