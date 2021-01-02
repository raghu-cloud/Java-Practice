package durga.maps;
import java.util.*;

public class NavigableSetInterfaceDemoWithTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet();
		t.add(2000);
		t.add(1000);
		t.add(3000);
		t.add(4000);
		t.add(5000);
		System.out.println(t.floor(2500));
		System.out.println(t.lower(2200));
		System.out.println(t.ceiling(1500));
		System.out.println(t.higher(1800));
		System.out.println(t.pollFirst());
		System.out.println(t.pollLast());
		System.out.println(t);
		System.out.println("reversing order of the set is:"+t.descendingSet());
		
		

	}

}
