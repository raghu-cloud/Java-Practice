package durga.maps;
import java.util.*;

public class ArraysSearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i= {30,29,409,293,30494,49};
		Arrays.sort(i);
		for(int d:i)System.out.println(d);
		System.out.println("------------");
		System.out.println("Seraching elements 30 in given array "+ Arrays.binarySearch(i, 30));
		System.out.println("Seraching elements 24 in given array "+ Arrays.binarySearch(i, 24));
		System.out.println("------");
		String[] s= {"X","Z","A","D"};
		Arrays.sort(s);
		System.out.println(Arrays.binarySearch(s, "A"));
		System.out.println(Arrays.binarySearch(s, "G"));
		System.out.println("----------");
		String[] s2= {"B","D","F","E"};
		Arrays.sort(s2,new ComparatorClassForArraysSort());
		System.out.println(Arrays.binarySearch(s2, "B",new ComparatorClassForArraysSort()));
		

	}

}
