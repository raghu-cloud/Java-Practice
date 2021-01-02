package ObjectClassMethods;

import java.lang.reflect.Method;

public class GetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Object o=new String("Durga");
		Class c=o.getClass();
		String name=c.getName();
		System.out.println(name);
		Method[] m=c.getDeclaredMethods();
		for(Method m1:m)
		{
			System.out.println(m1);
			count++;
		}
		System.out.println("total number of methods in class: "+c.getName()+" is "+count);
		
		

	}

}
