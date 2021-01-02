package durga.maps;
import java.util.*;

public class CollectionsSearchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l=new ArrayList<>();
		l.add("sharukh");
		l.add("amitabh");
		l.add("shilpa");
		l.add("akshay");
		System.out.println(l);
		Collections.sort(l, new ComparatorClassForCollectionsSearchDemo2());
		System.out.println(l);
		System.out.println(Collections.binarySearch(l, "amitabh",new ComparatorClassForCollectionsSearchDemo2()));
		System.out.println(Collections.binarySearch(l, "zakhir Hissain",new ComparatorClassForCollectionsSearchDemo2()));
		System.out.println(Collections.binarySearch(l, "aaron",new ComparatorClassForCollectionsSearchDemo2()));

	}

}
