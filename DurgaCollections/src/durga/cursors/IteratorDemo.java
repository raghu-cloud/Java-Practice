package durga.cursors;



import java.util.*;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		for(int i=0;i<=10;i++)
			al.add(i);
		Iterator g= al.iterator();
		System.out.println("name of the iterator class is "+g.getClass().getName());
		while(g.hasNext())
		{
			Integer I=(Integer)g.next();
			if(I%2==0)
				System.out.println(I);
			else
				g.remove();
		}
		System.out.println("---------------");
		System.out.print(" "+al);
		System.out.println();

	}

}
