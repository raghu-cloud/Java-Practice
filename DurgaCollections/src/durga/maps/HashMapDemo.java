
package durga.maps;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put("chiranjeevi", 700);
		h.put("balahia",800);
		h.put("venkatesh", 200);
		h.put("nagaraj",300);
		System.out.println(h);
		System.out.println(h.put("chiranjeevi", 1000));
		Object o=h.get("balahia");
		System.out.println(o);
		Object o2=h.remove("nagaraj");
		System.out.println(o2);
		System.out.println(h);
		System.out.println(h.containsKey("nagaraj"));
		System.out.println(h.containsKey("chiranjeevi"));
		System.out.println(h.containsValue(200));
		System.out.println(h.isEmpty());
		System.out.println(h.size());
	    Set s=h.keySet();
	    System.out.println(s);
	    System.out.println(s.getClass().getName());
	    Collection c=h.values();
	    System.out.println(c);
	    Set s2=h.entrySet();
	    System.out.println(s2);
	    Iterator itr=s2.iterator();
	    while(itr.hasNext())
	    {
	    	Map.Entry o1=(Map.Entry)itr.next();
	    	System.out.println(o1.getValue()+"---------"+o1.getKey());
	    	if(o1.getKey().equals("balahia"))
	    		o1.setValue("10");
	    }
	    System.out.println(h);

	}

}
