package durga.maps;
import java.util.*;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		// noramal HashMap which Dominates over Garbage collection
	    HashMap h=new HashMap();
		TempDemo t=new TempDemo();
		h.put(t, "durga");
		t=null;
		System.out.println(h);
		System.gc();
		Thread.sleep(5000);
		System.out.println(h);
		System.out.println("----------");
		
		
		//WeakHashMap where gc dominates WeakHashMap
		 WeakHashMap h1=new WeakHashMap();
			TempDemo t2=new TempDemo();
			h1.put(t2, "durga");
			t2=null;
			System.out.println(h1);
			System.gc();
			Thread.sleep(5000);
			System.out.println(h1);
		
		

	}
	
	
		

}
