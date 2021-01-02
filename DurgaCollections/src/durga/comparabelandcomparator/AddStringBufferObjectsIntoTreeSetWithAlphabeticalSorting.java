package durga.comparabelandcomparator;
import java.util.*;

public class AddStringBufferObjectsIntoTreeSetWithAlphabeticalSorting {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparator());
		t.add(new StringBuffer("z"));
		t.add(new StringBuffer("v"));
		t.add(new StringBuffer("d"));
		t.add(new StringBuffer("g"));
		t.add(new StringBuffer("e"));
		t.add(new StringBuffer("l"));
		t.add(new StringBuffer("y"));
		t.add(new StringBuffer("a"));
		t.add(new StringBuffer("a"));
		System.out.println(t);
		

	}

}

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		return s1.compareTo(s2);
		
	}
	
}
