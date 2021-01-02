package AnyPractice;

import java.util.*;

public class TestDemo {
	
	public static void re(String s)
	{
		char[] c=s.toCharArray();
		ArrayList<Character> al=new  ArrayList<Character>();
		for(int i=0;i<c.length;i++)
			al.add(c[i]);
		while(al.contains('('))
		{
			Character temp=null;
			int j=al.indexOf(')');
			int i=al.lastIndexOf('(');
			int a=j-1;
			int b=i+1;
			if(a!=b)
			{
				
			}
			System.out.println(i+" "+j);
			System.out.println(al);
			break;
		}
	}
	
	   
		
	
	public static void main(String[] args) {
		String str="a(bc)de";
		re(str);
		
	
}
}
