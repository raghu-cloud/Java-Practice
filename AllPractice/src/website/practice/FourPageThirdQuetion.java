package website.practice;

public class FourPageThirdQuetion {
	public static String altPairs(String str) {
	
		String result_string=new String(" ");
		for(int i=0;i<str.length();i=i+3) {
			result_string=result_string+str.charAt(i);
			i++;
			if(i<str.length())
			{
				result_string=result_string+str.charAt(i);
			}
		}
		return result_string.trim();
	}
	
	public static void main(String[] args)
	{
		String str=altPairs("CodingHorror");
		System.out.println(str);
		
	}

}
