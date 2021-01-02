package durga.maps;
import java.util.*;

public class ArraysSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {20,10,50,30,70};
		System.out.println("Before sorting the array elements");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		Arrays.sort(a);
		System.out.println("After sorting a given array with the sort() method present inside the Arrays class");
		for(int c:a)
			System.out.println(c);
		System.out.println("-----------");
		String[] s= {"Ramu","Bheemu","Shymu"};
		System.out.println("Before sorting the string [] ");
		for(String d:s)
			System.out.println(d);
		Arrays.sort(s);
		System.out.println("After sorting the the given string[] with the help method called sort() present inside the Arrays Utility class");
		for(String  r:s)
			System.out.println(r);
		System.out.println("-----------");
		String [] s2= {"X","A","T"};
		System.out.println("Before sorting the given String array ");
		for(String g:s2)
			System.out.println(g);
		Arrays.sort(s2,new ComparatorClassForArraysSort());
		System.out.println("After sorting the String[] with customised Sorting order");
		for(String w:s2)
			System.out.println(w);
		
		
	}
}
	


