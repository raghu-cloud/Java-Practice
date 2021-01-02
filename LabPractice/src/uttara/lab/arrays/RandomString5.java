package uttara.lab.arrays;

import java.util.Random;

public class RandomString5 {
	public static String generateRandomString(String str,int length)
	{
		StringBuilder sd=new StringBuilder();
		Random random=new Random();
		for(int i=0;i<length;i++)
		{
			sd.append(str.charAt(random.nextInt(str.length())));
		}
		return sd.toString();
		
	}
	
	public static String[] generateRandomStrings(String s)
	{
		String[] str=new String[10];
		Random random=new Random();
		StringBuilder sd=new StringBuilder();
		for(int i=0;i<str.length;i++)
		{
			sd.append(s.charAt(random.nextInt(17)));
			String t=sd.toString();
			str[i]=t;
		}
		return str;
	}
	public static void main(String[] args)
	{
		
		System.out.println(generateRandomString("abcdefghijklmnopqrstuvwxyz0123456789",17));
		String[] to=generateRandomStrings("abcdefghijklmnopqrstuvwxyz0123456789");
		for(int i=0;i<10;i++)
		{
		System.out.println(to[i]);
		}
		
		
		
	}

}
