package codefight;
import  java.util.*;

public class RectangularMat {
	static String[] addBorder(String[] picture) {
		int len=0;
		String [] res=new String[picture.length+2];
		for(int i=0;i<picture.length;i++)
			len=picture[i].length();
		char[] arr=new char[len+2];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]='*';
		}
		String s1=new String(arr);
		res[0]=s1;
		res[res.length-1]=s1;
		for(int i=0;i<picture.length;i++)
		{
			res[i+1]="*"+picture[i]+"*";
		}	
		return res;
	 }
	
	static String[] addBorder2(String[] picture) {
		String s="";
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<picture[0].length()+2;i++)
			s=s+"*";
		al.add(s);
		for(int i=0;i<picture.length;i++)
			al.add("*"+picture[i]+"*");
		al.add(s);
		String [] res=al.toArray(new String[picture.length+2]);
		return res;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"abc","ded"};
		String []  res=addBorder2(str);
		for(String s:res)
			System.out.println(s);
		

	}

}
