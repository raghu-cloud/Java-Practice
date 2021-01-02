package durga.cursors;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		for(int i=0;i<=10;i++)
		{
			 v.addElement(i);
			 
		}
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			Integer I =(Integer)e.nextElement();
			if(I%2==0)
				System.out.println(I);
		}
		System.out.println("===============================");
		Stack s=new Stack();
		for(int i=10;i<=20;i++)
		{
			s.push(i);
		}
		Enumeration e1=s.elements();
		while(e1.hasMoreElements())
		{
			Integer i=(Integer)e1.nextElement();
			if(i%2==0)
				System.out.println(i);
			
		}
		
		System.out.println("==========================");
		Object[] o=v.toArray();
		int[] arr=new int[o.length];
		for(int i=0;i<o.length;i++) {
			Integer i2=(Integer)o[i];
			int i3=i2.intValue();
			arr[i]=i3;
			
		}
		for(int x:arr)
			System.out.print(" "+x);

	}

}
