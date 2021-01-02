package concurrentUpdateException;

import java.util.*;

public class MyThread extends Thread {
	static ArrayList l=new ArrayList();
	public void run()
	{
		System.out.println("MyThread is updating the Collection Object");
		l.add("D");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		l.add("A");
		l.add("Z");
		l.add("T");
		MyThread m=new MyThread();
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			m.run();
			String s=(String)itr.next();
			System.out.println("The element that is itarating is: "+s);
			Thread.sleep(3000);
			
		}
		

	}

}
