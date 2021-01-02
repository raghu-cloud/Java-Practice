package durga.comparabelandcomparator;

public class CompaarableDemo {

	public static void main(String[] args) {
		String s1="abd";
		String s2="abd";
		int i=s1.compareTo(s2);
		if(i<0)
			System.out.println(s2 +" is smaller than "+ s1);
		else if(i>0)
			System.out.println(s1 +" is greater than "+s2);
		else
			System.out.println(s1+ " and  "+s2 +" are equeal");

	}

}
