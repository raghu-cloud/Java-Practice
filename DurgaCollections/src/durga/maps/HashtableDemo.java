package durga.maps;
import java.util.*;

public class HashtableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable h=new Hashtable();
		h.put(new TempClassForHashtableDemo(5), "A");
		h.put(new TempClassForHashtableDemo(2), "B");
		h.put(new TempClassForHashtableDemo(6), "C");
		h.put(new TempClassForHashtableDemo(15), "D");
		h.put(new TempClassForHashtableDemo(23), "E");
		h.put(new TempClassForHashtableDemo(16), "F");
		System.out.println(h);
		
		System.out.println("after changing the initial capacity of the Hashtable");
		
		Hashtable h1=new Hashtable(25);
		h1.put(new TempClassForHashtableDemo(5), "A");
		h1.put(new TempClassForHashtableDemo(2), "B");
		h1.put(new TempClassForHashtableDemo(6), "C");
		h1.put(new TempClassForHashtableDemo(15), "D");
		h1.put(new TempClassForHashtableDemo(23), "E");
		h1.put(new TempClassForHashtableDemo(16), "F");
		System.out.println(h1);

	}

}
