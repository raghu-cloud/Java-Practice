
public class FinllyTest {
	
	
	
	public static void main(String[] args)
	{
		try {
			System.out.println("No exception in try");
		}
		catch(Throwable e)
		{
			System.out.println("inside the catch block");
			e.printStackTrace();
		}
		finally {
			System.out.println("even though there is no exception in try finally executed");
		}
		
			
		
	}

}
