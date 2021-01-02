package durga.bounds;
import java.util.*;

public class GenericMethodsDemo {
	public static void m1(ArrayList<String> l)
	{
		l.add("B");
		l.add("C");
	}
	
	public static void m2(ArrayList<?> l)
	{
		System.out.println("inside Arraylist<?> method");
		l.add(null);
	}
	
	public static void m3(ArrayList<? extends Number> l)
	{
		System.out.println("Inside ArrayList<? extends Number> method");
		l.add( null);
	}
	
	public static void m4(ArrayList<? super Runnable> l)
	{
		System.out.println("Inside the ArrayList<? super Runnabel> mehtod");
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l=new ArrayList<String>();
		m1(l);
		l.add("A");
		System.out.println(l);
		System.out.println("------");
		ArrayList<Integer> l1=new ArrayList<Integer>();
		m2(l1);
		m2(l);
		System.out.println("--------");
		m3(l1);
		System.out.println("------------");
		ArrayList<Object> l2=new ArrayList<Object>();
		m4(l2);

	}

}
