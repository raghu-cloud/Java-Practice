package ObjectClassMethods;

public class StudentEquals {
	int rollno;
	String name;
	StudentEquals(String s,int i)
	{
		this.name=s;
		this.rollno=i;
	}
	
	public boolean equals(Object obj)
	{
		if(obj==this)
			return true;
		if(obj instanceof StudentEquals)
		{
			StudentEquals s=(StudentEquals)obj;
			if(name.equals(s.name) && rollno==s.rollno)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		StudentEquals s1=new StudentEquals("Durga",101);
		StudentEquals s2=new StudentEquals("Ravi",102);
		StudentEquals s3=new StudentEquals("Durga",101);
		StudentEquals s4=s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));

	}

}
