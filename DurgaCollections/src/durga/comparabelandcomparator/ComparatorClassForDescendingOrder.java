package durga.comparabelandcomparator;
import java.util.*;

public class ComparatorClassForDescendingOrder implements Comparator {

	
	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=0;
		Integer i2=0;
		if(o1 instanceof Integer)
		{
			i1=(Integer)o1;
			i2=(Integer)o2;
		}
		int i3=i1.intValue();
		int i4=i2.intValue();
		if(i3<i4)
			return +1;
		
		if(i3>i4)
			return -1;
		return 0;
	}

}
