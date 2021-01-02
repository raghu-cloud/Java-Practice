package practice.computer.local;

public class SixthPageSixthQuesion {
	public static String delDel(String str) {
		
		  String substring=str.substring(1, 4);
		  String test=new String("del");
		  if(substring.equals(test))
		  {
			  StringBuilder sbr=new StringBuilder(str);
				  sbr.deleteCharAt(1);
				  sbr.deleteCharAt(2);
				  sbr.deleteCharAt(1);
				  String result=sbr.toString();
				  return result;
		 }
		  return str;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(delDel("adelHello"));

	}

}
