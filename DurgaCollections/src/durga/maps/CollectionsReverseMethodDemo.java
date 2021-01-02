package durga.maps;
import java.util.*;

public class CollectionsReverseMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l=new ArrayList();
		for(int i=0;i<10;i++)
			l.add(i);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);

	}

}
