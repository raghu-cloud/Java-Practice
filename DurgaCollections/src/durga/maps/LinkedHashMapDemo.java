package durga.maps;
import java.util.*;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// normal hash map where insertion order is not preserved
		HashMap h=new HashMap();
		h.put("chiranjeevi", 700);
		h.put("balahia",800);
		h.put("venkatesh", 200);
		h.put("nagaraj",300);
		System.out.println(h);
		
		//LinkedHashMap where insertion order is preserved
		LinkedHashMap h1=new LinkedHashMap();
		h1.put("chiranjeevi", 700);
		h1.put("balahia",800);
		h1.put("venkatesh", 200);
		h1.put("nagaraj",300);
		System.out.println(h1);

	}

}
