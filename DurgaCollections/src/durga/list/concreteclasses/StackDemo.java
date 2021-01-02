package durga.list.concreteclasses;
import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		Stack s=new Stack();
		System.out.println(s.push("a"));
		System.out.println(s.push("b"));
		System.out.println(s.push("c"));
		System.out.println(s.push("d"));
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.empty());
		System.out.println(s.size());
		System.out.println(s.search("a"));
		System.out.println(s.search("v"));
		
		

	}

}
