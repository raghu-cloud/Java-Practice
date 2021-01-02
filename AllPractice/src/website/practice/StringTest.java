package website.practice;

public class StringTest {
	public static String compressString(String s) {
		char c=0;
		String res=new String("");
		for(int i=0;i<s.length();i++)
		{
		 if(s.charAt(i)!=c)
		 {
		  int count=1;
		  c=s.charAt(i);
          
          
		  for(int j=i+1;j<s.length();j++)
		  {
			 
		   if(s.charAt(j)==c  )
		   {
		    count++;
		   }
		   else
		   break;
		   }
		   res=res+c+count;
		  }
		 }

		
	
		if(res.length()<s.length())
		return res.trim();
		return s;
		}
	

	public static void main(String[] args) {
		String str=new String("nnndkdkkkkkdd");
		String res=compressString(str);
		System.out.println(res);
		
		

	}

}
