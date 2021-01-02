package durga.maps;
import java.util.*;

public class CollectionsSerachDemo {

	public static void main(String[] args) {
		// Example for default sorting of the arraylist using method sort() present inside the collections class
		ArrayList l=new ArrayList();
		l.add(38);
		l.add(12);
		l.add(25);
		l.add(39);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		System.out.println(Collections.binarySearch(l, 38));
		System.out.println(Collections.binarySearch(l, 40));
		System.out.println(Collections.binarySearch(l, 11));

	}

}
