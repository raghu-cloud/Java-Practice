package durga.set.concreteclasses;
import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("z");
		lhs.add("a");
		lhs.add("q");
		lhs.add("w");
		lhs.add("e");
		lhs.add("r");
		lhs.add("t");
		lhs.add("y");
		System.out.println("trying to add dupicate to the collection "+lhs.add("z"));
		System.out.println(lhs);

	}

}
