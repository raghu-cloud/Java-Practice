package durga.maps;
import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TreeMap with natural sorting order 
		TreeMap t=new TreeMap();
		t.put(10, "Ramu");
		t.put(20, "bheemu");
		t.put(3, "shymu");
		t.put(58, "ashley");
		t.put(43, "kate");
		t.put(49, "sony");
		t.put(39, "bheemu");
		System.out.println(t);
		Set s=t.keySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Integer i=(Integer)itr.next();
			
			if(i==10)
			{
				t.put(10, "ramu chaged to shyam");
			}
		}
		System.out.println(s);
		System.out.println(t);
		

	}

}
