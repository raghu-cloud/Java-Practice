package AnyPractice;

import java.util.*;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack<>();
		s.add(0);
		s.add(1);
		s.add(2);
		s.push(3);
		s.add("Durga");
		System.out.println("Before remooval of element in stack"+s);
		//s.pop();
		System.out.println(s);
		int i=s.search(0);
		System.out.println(i);
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Object o=itr.next();
			int g=(Integer)o;
				System.out.println(g);
		}
	}

}
