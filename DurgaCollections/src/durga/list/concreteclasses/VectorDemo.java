package durga.list.concreteclasses;
import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.addElement("A");
		v.addElement("B");
		v.addElement("c");
		v.removeElementAt(1);
		System.out.println(v);
		System.out.println(v.elementAt(1));
		v.addElement("d");
		v.addElement("e");
		System.out.println(v);
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.size());
		System.out.println(v.capacity());
	}

}
