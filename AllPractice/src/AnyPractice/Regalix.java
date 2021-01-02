package AnyPractice;

import java.util.ArrayList;

public class Regalix {
	public static String[] test(String[] s)
	{

		StringBuffer sbr=new StringBuffer();
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<s.length;i++)
		{ 
			switch(i)
			{
			case 0:sbr.append(s[i].charAt(i)+"_");
			break;
			
			//case 1:sbr.append(s[i].charAt(i)+"_");
			
			}			
			
			
			
		}
		sbr.deleteCharAt(sbr.length()-1);
		String r=new String(sbr);
		al.add(r);
		String[] res=al.toArray(new String[s.length]);
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] str= {"One","Two","Three","Four"};
		String [] t=test(str);
		for(String s:t)
			System.out.println(s);

	}

}
