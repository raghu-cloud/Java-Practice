package durga.comparabelandcomparator;
import java.util.*;

public class TreeSetWithMyComparator {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new ComparatorClassForDescendingOrder());
		t.add(8);
		t.add(4);
		t.add(9);
		t.add(1);
		t.add(12);
		t.add(2);
		System.out.println(t);
		

	}

}
