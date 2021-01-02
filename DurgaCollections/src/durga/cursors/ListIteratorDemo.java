package durga.cursors;

import java.util.*;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("balakrishna");
		ll.add("venky");
		ll.add("chiru");
		ll.add("nag");
		System.out.println(ll);
		ListIterator lstr=ll.listIterator();
		while(lstr.hasNext())
		{
			String s=(String)lstr.next();
			if(s.equals("nag"))
				System.out.println("checking the previous object "+lstr.hasPrevious());
				lstr.add("chaitu");
			if(s.equals("chiru"))
				lstr.add("charan");
			
		}
		System.out.println(ll);
		
		
		
		
	
		
		
		
		

	}

}
