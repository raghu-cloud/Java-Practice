package durga.list.concreteclasses;

import java.util.*;
public final class ArrayListt {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		System.out.println("adding A to collection "+al.add("A"));
		System.out.println("adding 10 to Collection "+al.add(10));
		System.out.println("Adding null to collection "+al.add(null));
		System.out.println("adding 30 to collection "+al.add(30));
		System.out.println("removing element at the index of 2 from the collection "+al.remove(2));
		System.out.println("Adding 10 to the collection at the index 9");
		al.add(3, 10);
		al.add(1,5);
		al.add(5,4);
		al.addAll(al);
		al.remove("A");
		System.out.println("checking wether our collection contains the 10 "+al.contains(10));
		al.remove(6);
		System.out.println(al.containsAll(al));
		System.out.println(al.size());
		Object[] arr=al.toArray();
		System.out.println(al);
		for(Object x:arr)
			System.out.print(" "+x);
		System.out.println();
		System.out.println(al.size());
		System.out.println(al.addAll(10,al));
		System.out.println(al);
		System.out.println(al.remove(10));
		System.out.println(al.get(10));
		System.out.println(al.size());
		System.out.println(al.set(10, 11));
		System.out.println(al);
		System.out.println(al.indexOf(10));
		System.out.println(al.lastIndexOf(10));
		
		System.out.println(al.get(10));
		Object[] array=al.toArray();
		for(Object f:array)
			System.out.print(" "+f);
		System.out.println();
		

	}

}
