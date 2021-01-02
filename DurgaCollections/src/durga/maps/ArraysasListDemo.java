package durga.maps;
import java.util.*;

public class ArraysasListDemo {

	public static void main(String[] args) {
		String s[] = {"A","Z","B"};
		List l=Arrays.asList(s);
		System.out.println(l);
		s[0]="K";
		System.out.println(l);
		l.set(1,"K");
		for(String s1:s)
			System.out.println(s1);
		//l.add("durga"); RE:UsupportedOperationException
		//l.remove(2); RE:UnsupportedOparationException
		//l.set(1,new Integer(10)); RE:ArrayStoreException
		
		

	}

}
