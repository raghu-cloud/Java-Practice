package durga.maps;
import java.util.*;

public class NavigableMapInterfaceDemoWithTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap t=new TreeMap<>();
		t.put("Sultan","Sallu");
		t.put("Airleft", "Akshay");
		t.put("MissionImpossible", "Tom");
		t.put("Romio", "Angelina");
		System.out.println(t);
		System.out.println(t.floorKey("Babyboss"));
		System.out.println(t.lowerKey("Juliet"));
		System.out.println(t.ceilingKey("Titanic"));
		System.out.println(t.higherKey("Titanic"));
		System.out.println(t.pollFirstEntry());
		System.out.println(t);
		System.out.println(t.pollLastEntry());
		System.out.println(t.descendingKeySet());

	}

}
