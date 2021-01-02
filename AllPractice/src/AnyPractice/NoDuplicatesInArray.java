package AnyPractice;

import java.util.*;

public class NoDuplicatesInArray {
	public static void test(int[] arr)
	{
		ArrayList al=new ArrayList();
		for(int i=0;i<arr.length;i++)
		{
			if(!al.contains(arr[i]))
			{
				al.add(arr[i]);
			}
		}
		System.out.println(al);
	}

	public static void main(String[] args) {
		int[] array= {1,2,4,3,2,5,6,5};
		test(array);

		
	}

}
