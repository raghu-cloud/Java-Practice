package practice.computer.local;



public class FinallyTest {
	public static void m1()
	{
		m2();
	}
	public static void m2()
	{
		m3();
	}
	public static void m3()
	{
		
	}
	public static void main(String[] args)
	{
		try
		{
			m1();
			
		}
		catch(Throwable t)
		{
			System.out.println("exception:"+t.getMessage());
			t.printStackTrace();
		}
		finally
		{
			System.out.println("inside finally");
		}
	}

}
