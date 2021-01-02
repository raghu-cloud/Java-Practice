package durga.comparabelandcomparator;
import java.util.*;

public class OwnComparableAndComparator {

	public static void main(String[] args) {
		Employee e1=new Employee("nag",100);
		Employee e2=new Employee("balaih",200);
		Employee e3=new Employee("chiru",50);
		Employee e4=new Employee("venki",150);
		Employee e5=new Employee("nag",100);
		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println("default sorting provoided by overriding the compareTo() method in Employee class >> sorting based on id");
		System.out.println(t);
		
		
		TreeSet t2=new TreeSet(new MyComparator3());
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);
		t2.add(e5);
		System.out.println("customised sorting by comparator class >>sorting based on name");
		System.out.println(t2);
		

	}

}


class Employee implements Comparable
{
	String name;
	int id;
	Employee(String n,int i)
	{
		this.name=n;
		this.id=i;
	}
	public String toString()
	{
		return name+"--"+id;
	}
	@Override
	public int compareTo(Object o) {
		int id1=this.id;
		Employee e1=(Employee)o;
		int id2=e1.id;
		if(id1<id2)
			return -1;
		else if(id1>id2)
			return +1;
		else return 0;
	}
}



class MyComparator3 implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		String s1=e1.name;
		String s2=e2.name;
		return s1.compareTo(s2);
	}
	
}
