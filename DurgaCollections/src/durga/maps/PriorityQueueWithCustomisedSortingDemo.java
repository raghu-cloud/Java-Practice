package durga.maps;

import java.util.*;

public class PriorityQueueWithCustomisedSortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue  q=new PriorityQueue(10,new  ComparatorForPriorityQueue());
		q.offer("a");
		q.offer("b");
		q.offer("z");
		q.offer("l");
		q.offer("b");
		q.offer("a");
		q.add("a");
		System.out.println(q);

	}

}
