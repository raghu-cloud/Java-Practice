package practice.computer.local;

import java.io.IOException;

public class CheckedVsUnchecked {
	//checked excepitons
	public static void test () throws CheckedEx
	{
		CheckedEx e=new CheckedEx("This is example of CheckedEx");
		throw e;
	}
	public static void test2() throws IOException
	{
		IOException e2=new IOException("this is example of IoEx");
		throw e2;
	}
	
	
	//unchecked Excepiton
	public static void test3()
	{
		UncheckedEx u=new UncheckedEx("This is example of unchecked Exception");
		throw u;
	}
	public static void test4()
	{
		IllegalArgumentException u2=new IllegalArgumentException();
		throw u2;
	}
	
	public static void main(String[] args)
	{
		//compiler forces us to catch checked exception
		try {
			test();
		} catch (CheckedEx e)             //cathing the exception throwed by test2()
		{
			e.printStackTrace();
			e.getMessage();
		}
		try {
			test2();
		}
		catch(IOException e1)
		{
			e1.printStackTrace();
		}
		
		//compiler won't force to catch the unchecked Exception
		test3();
		test4();
		
		
	}
}
