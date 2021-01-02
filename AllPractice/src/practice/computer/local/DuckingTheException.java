package practice.computer.local;

public class DuckingTheException {
	public static void test () throws CheckedEx
	{
		CheckedEx e=new CheckedEx("This is example of CheckedEx");
		throw e;
	}
	
	/*
	 * 1)method test() is throwing the checked exception and we are calling that method inside method test2().
	 * 2)in method test2() we should handle that exception thrown by the test() method because exception thrown by 
	 * method test() is checked exception.
	 * 3)handling of exception done by two ways either by catching it or ducking it.
	 * 4)we should catch the exception only when we should know how to handle it.
	 * 5)assume in method test2() we don't know how to handle it therefore we should duck that exception.
	 */
	public static void test2() throws CheckedEx  //ducking the exception thowed by test()
	{
		test();
	}
	/*
	 * 1)method test2() is again throwing that same exception that thown by the test() to main() because it 
	 * ducked that exceptoin of test().
	 * 2)in main() we should handle that exception by only catching it becuse it the  parent method of all.
	 */
	
	public static void main(String[] args)
	{
		try {
			test2();
		} catch (CheckedEx e)             //cathing the exception throwed by test2()
		{
			e.printStackTrace();
		}
	}

}
