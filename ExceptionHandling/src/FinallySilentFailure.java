

public class FinallySilentFailure {
	
	public static int m1()
	{
		try {
			int i=5/0;
			
		}
		catch(NullPointerException e)
		{
			System.out.println("inside the catch block");
			e.printStackTrace();
		}
		finally {
			return 10;
		}
		//return 10;
	}
	
	{
    	System.out.println("Instance initialzer");
    }
	
	
	public static void main(String[] args) {
		//System.out.println(m1());
		/*double d=0x10;
		System.out.println(d);
		
		Animalnterface[] animal=new Animalnterface[10];
		animal[0]=new AnimalImplementedDog();*/
		/*int x=10;
		int y=x++;
		System.out.println("y="+y);
		System.out.println("x="+x);*/
		
		/*byte b=0;
		while(++b<128)
			System.out.println(b);*/
		
		l1:
		{
			System.out.println("inside lables block");
		}
	
	    


	}

}

/*NOTE:Never add return in finally block, if you add return in finally if any exception occured in try that will be ingnored by jvm 
 * In the above scenario there is excepion in try of method m1() but still we cant see any exception after running programm.
 * because exception in not catched by catch block and finally block executes and finally returning the value to m1() method so jvm ignores the exception occured
 * 
 * */
 