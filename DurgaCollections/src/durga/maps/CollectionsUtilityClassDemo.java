package durga.maps;
import java.util.*;

public class CollectionsUtilityClassDemo {
    
	public static void main(String[] args) {
		// with default natural sorting order method of Collections is sort();
		ArrayList al= new ArrayList<>();
		al.add(500);
		al.add(200);
		al.add(900);
		al.add(100);
	//	al.add("n"); RE:ClassCastException
	//	al.add(null); RE:NullPointerException
		
		System.out.println("before sorting the arraylist :"+al);
		Collections.sort(al);
		System.out.println("After sorting the arraylist with sort method of the collection class"+al);
		
		

	}

}
