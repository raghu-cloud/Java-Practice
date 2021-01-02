package durga.maps;
import java.util.*;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		// TreeMap with customized sorting order
		TreeMap t=new TreeMap(new MyComparatorForTreeMap());
		t.put("Ashley", 10);
		t.put("Brenda", 100);
		t.put("ethan",1);
		t.put("cruse", 4);
		System.out.println(t);
		Collection c=t.entrySet();
		System.out.println(c);
		Iterator itr=c.iterator();
		while(itr.hasNext())
		{
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m.getKey()+"----"+m.getValue());
			if(m.getKey().equals("ethan"))
			{
				m.setValue("ethan changed to mission impossible ");
			}
		}
		System.out.println(t);
		

	}
	

		

}
