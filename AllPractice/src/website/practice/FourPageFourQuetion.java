package website.practice;

public class FourPageFourQuetion {
	
	public static String test(String str)
	{
	String result_string=new String(" ");
	 int i=0;


	while(i<str.length()-2)
	{
		
		result_string+=str.charAt(i);
		i++;
	}
	
	
		
		if(i==str.length()-2)
		{
			result_string+=str.charAt(i+1);
			i++;
		}
		if(i==str.length()-1)
		{
			result_string+=str.charAt(i-1);
		}
		

	
	return result_string.trim();
	}
	
	public static void main(String[] args)
	{
		String str=test("  hello");
		System.out.println(str);
	}

}
