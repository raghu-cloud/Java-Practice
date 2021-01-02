package AnyPractice;

public class Car {
	
	public static int numOfcomparision(String s1,String s2)
	{
		int count=0;
		int resul=0;
		while(resul!=-1) {
		     resul=(s2.indexOf(s1,resul));
		     if(resul!=-1)
		     {
		    	 count++;
		    	 resul=resul+s1.length();
		     }
			}
		return count;
	}
	
	public static void main(String[] args)
	{
		/*numOfcomparision(String s1,String s2)
		String s1=new String("ra");
		String s2=new String("aabracadabrarara");
		System.out.println(numOfcomparision(s1,s2));*/
	}
}