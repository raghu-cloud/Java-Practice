package AnyPractice;



public class IntegerToArray {
	public static int[] intToArray(int num)
	{
		Integer u=new Integer(num);
		String str=u.toString();
		System.out.println(str);
		int[] array=new int[str.length()];
		for(int i=0;i<str.length();i++)
		{
			array[i]=str.charAt(i)-'0';
		}
		
		return array;
	}
	
	public static int arrayToInt(int[] arr)
	{
		StringBuilder sbr=new StringBuilder();
		for(int x:arr)
		{
			sbr.append(x);
		}
		String str=sbr.toString();
		int res=Integer.parseInt(str);
		return res;
	}
	
	
	
	
	
 
	
	
	
	


	public static void main(String[] args) {
		
		int [] r=intToArray(4364546);
		for(int i=0;i<r.length;i++)
		{
			System.out.print(r[i]);
		}
		System.out.println();
		char c=(char)1;
		System.out.println(c);
		
		int x=arrayToInt(r);
		System.out.println(x);
		
		System.out.println("====================");
		//boolean b=isPalindrome(434);
		//System.out.println(b);
		
		

	}

}
