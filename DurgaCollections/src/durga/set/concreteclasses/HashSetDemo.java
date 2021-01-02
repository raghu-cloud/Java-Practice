package durga.set.concreteclasses;
import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add("b");
		h.add("a");
		h.add("s");
		h.add("c");
		h.add("e");
		h.add("f");
		System.out.println("trying to add duplicate "+h.add("b"));
		System.out.println(h);

	}

}
