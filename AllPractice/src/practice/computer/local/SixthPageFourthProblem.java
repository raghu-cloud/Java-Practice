package practice.computer.local;

public class SixthPageFourthProblem {
	public static String theEnd(String str, boolean front) {
		char result = 0;
		if(front==true)
			result=str.charAt(0);
		if(front==false)
			result=str.charAt(str.length()-1);
		String st=" "+result;
		return st;
		
		  
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(theEnd("Hello",true));

	}

}
