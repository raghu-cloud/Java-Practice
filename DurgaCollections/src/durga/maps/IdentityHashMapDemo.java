package durga.maps;
import java.util.*;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		// Normal HashMap where keys are compared based on .equals() method thats the default comparision of HashMap
		HashMap h=new HashMap();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		h.put(i1, "ramu");
		h.put(i2,"bheemu");
		System.out.println(h);
		//ouput={10=bheemu} because i1.equals(i2) is true therefore i2 is considered as a duplicate key and replaces the value of i1 with bheemu here comparion done by value.
		
		//if we use IdentityHashMap then comparision is based on == operator 
		IdentityHashMap h2=new IdentityHashMap();
		Integer i3=new Integer(10);
		Integer i4=new Integer(10);
		h2.put(i3, "ramu");
		h2.put(i4,"bheemu");
		System.out.println(h2);
		//output is {10=ramu, 10=bheemu} because in IdentityHashMap comparision is done by == i3 is pointing to one object which contains the value 10 and i4 is 
		//pointing to another object which contains the same value 10. here comparision is done by a references not by value

	}

}
