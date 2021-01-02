package reverse;

public class ReverseMethodOfStringBufferImplementation {
	
	public static String  reverse(String s)
	{
		StringBuffer sbr=new StringBuffer();
		char[] c=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--)
		{
			sbr.append(s.charAt(i));
		}
		String res=sbr.toString();
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello World";
		String res=reverse(s);
		System.out.println(res);
		
		

	}

}
