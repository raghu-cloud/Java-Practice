package codefight;
import java.util.*;

public class ReverParanthesis {
	public static String rev(String s)
	{
		int count=0;
		
		char[] ch =s.toCharArray();
		int r=ch.length-1;
		for(int k=0;k<ch.length;k++)
		{
		while(ch[k]=='(')
		{
			count=count+2;
		int startIndex=0;
		int endIndex=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='(')
			{
				startIndex=i;
			}
			if(ch[i]==')')
			{
				endIndex=i;
				break;
			}
		}
		int first=startIndex+1;
		int last=endIndex-1;
		//char f=ch[first];
		//char l=ch[last];
		for(int i=first;i<=last;i++)
		{
			char temp=ch[first];
			ch[first]=ch[last];
			ch[last]=temp;
			first++;
			last--;
		}
		
		/*System.out.println(startIndex+" "+first+" "+f);
		
		System.out.println(endIndex+" "+last+" "+l);
		String sg=new String(ch);
		System.out.println(sg);
		/*ArrayList<Character> al =new ArrayList<Character>();
		for(int i=0;i<ch.length;i++)
		{
			al.add(ch[i]);
		}
		System.out.println(al);
		al.remove(startIndex);
		al.remove(endIndex-1);
		System.out.println(al);
		int ft=0;
		int lt=0;
		int i=0;
		if(al.contains('('))
		{
			ListIterator<Character> itr=al.listIterator();
			while(itr.hasNext())
			{
				
				if(itr.next()=='(')
				{
					
					ft=itr.nextIndex();
				}
				
			}
			while(itr.hasPrevious())
		}
		System.out.println(ft);
		System.out.println(lt);*/
		for(int i=startIndex;i<ch.length-1;i++)
		{
			ch[i]=ch[i+1];
			//ch[ch.length-1]=0;
		}
		for(int i=endIndex-1;i<ch.length-1;i++)
		{
			ch[i]=ch[i+1];
			//ch[ch.length-1]=0;
		}
		//ch[ch.length-1]=0;ch[ch.length-2]=0;
		
		/*while(count>0)
		{
			ch[r]=0;
			count--;
			r--;
		}*/
		//System.out.println(count);
	//	int jk=ch.length-count;
		//char[] x=new char[ch.length-count];
		
		//String gg=new String(ch);
		//System.out.println(gg);
		}
		}
		System.out.println(count);
		System.out.println(ch.length);
		int jk=ch.length-count;
		System.out.println(jk);
		char[] xx=new char[jk];
		for(int i=0;i<xx.length;i++)
		{
			xx[i]=ch[i];
		}
		String res=new String(xx);
		//ch[ch.length-4]=0;
		/*String ss=new String(ch);
		System.out.println(ss);
		System.out.println("r"+r);
		System.out.println("count="+count);
		//System.out.println(tt);*/
		return res;
	}
	

	public static void main(String[] args) {
		String str="Code(Cha(lle)nge)";
		String s=rev(str);
		System.out.println(s);

	}

}
