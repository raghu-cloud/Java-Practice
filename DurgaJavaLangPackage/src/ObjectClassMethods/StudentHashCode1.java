package ObjectClassMethods;

public class StudentHashCode1 {
	int rollno;
	String name;
	StudentHashCode1(String s,int i)
	{
		this.name=s;
		this.rollno=i;
	}
	
	public int hashCode()
	{
		return 0;
	}

	public static void main(String[] args) {
		StudentHashCode1 s1=new StudentHashCode1("Durga", 101);
		StudentHashCode1 s2=new StudentHashCode1("Durga", 102);
		System.out.println(s1);
		System.out.println(s2);
		

	}

}
