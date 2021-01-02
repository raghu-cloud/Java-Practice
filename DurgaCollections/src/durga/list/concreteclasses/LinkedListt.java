package durga.list.concreteclasses;
import java.util.*;

public class LinkedListt {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		//All Collection methods.....
		System.out.println("adding durga to collection "+l.add("Durga"));
		System.out.println("adding software to collection "+l.add("Software"));
		System.out.println("removing Durga from collection "+l.remove("Durga"));
		System.out.println(l);
		
		System.out.println("adding 50 to collection "+l.add(50));
	    System.out.println("size of collection is "+l.size());
	    System.out.println("checking wether the collection is empty or not " +l.isEmpty());
	    System.out.println("checking wether the collection contains the object Software "+l.contains("Software"));
	    System.out.println("checking wehter the collection contains the object software "+l.contains("software"));
	    System.out.println(l);
	    System.out.println("converting the linkedList to array ........");
	    Object[] ob=l.toArray();
	    System.out.println("Printing the elements from the array ");
	    for(Object x: ob)
	    	System.out.print(x);
	    System.out.println();
	    
	    System.out.println("-----------------------------");
	    //All methods of List.......
	    LinkedList l2=new LinkedList();
	    l2.add(0, "Hello");
	    System.out.println(l2);
	    l2.add(1,"world");
	    l2.add(2,"heya");
	    l2.add(3,"woow");
	    l2.add(4,"yew");
	    System.out.println(l2);
	    System.out.println("object present at index 1 is "+l2.get(1));
	    System.out.println("object present at index 4 is "+l2.get(4));
	    System.out.println("");
	    System.out.println(l2);
	    System.out.println("------------------------------");
	    
	    //All methods of LinkedList.............
	    LinkedList l3=new LinkedList();
	    l3.addFirst("durga");
	    l3.add("software");
	    System.out.println(l3);
	    l3.addLast("solution");
	    System.out.println(l3);
	    l3.add("heya");
	   l3.removeLast();
	    System.out.println(l3);
	    
	    
	    
	    
	    
	    
	    
		
		
		

	}

}
