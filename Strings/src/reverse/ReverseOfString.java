package reverse;



public class ReverseOfString {
	public static String reveseStringWithStringBuffer(String a) {
		StringBuilder s1=new StringBuilder();
		String s3=new String("");
		s1.append(a);
		s1=s1.reverse();
	    s1.toString();
	    String result=s3+s1;
		  return result;
		}
	
	
	public static void main(String[] args)
	{
		String str=reveseStringWithStringBuffer("HiBye");
		System.out.println(str);
		
		
		
	}

}
