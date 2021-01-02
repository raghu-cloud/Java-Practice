
package durga.comparabelandcomparator;

import java.util.*;


public class ReveseAlphabeticalInsertionIntoTreeSet
{
	public static void main(String[] args)
	{
		TreeSet t=new TreeSet(new ComparatorClassToInsertStringIntoTreeSetInReverseAlphbeticalOrder());
		t.add("Roja");
		t.add("Shobharani");
		t.add("Rajkumari");
		t.add("Gangabhavani");
		t.add("Ramulamma");
		t.add("Roja");
		System.out.println(t);
	}
	
}

class ComparatorClassToInsertStringIntoTreeSetInReverseAlphbeticalOrder implements Comparator {
	

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
		//or  return -s1.compareTo(s2);
		
	}
	

}
