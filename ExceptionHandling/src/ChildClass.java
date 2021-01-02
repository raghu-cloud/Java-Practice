
public class ChildClass extends ParentClass {
    
	public ChildClass()
	{
		super();
	}
	
	{
		System.out.println("CHILD CLASS instance initializer");
	}
	
	static
	{
		i=20;
		
	}
	
	public void display()
	{
		System.out.println("Displaying super class i value using super keyword"+super.i);
	}
	
	public static void main(String[] args)
	{
		//ChildClass cl=new ChildClass();
		//cl.display();
		//System.out.println(ParentClass.i);
		//System.out.println(ChildClass.class);
		/*int i=5;
		System.out.println(--i+" ");*/
		int[][] arr=new int[2][100];
		arr[0]=new int[] {10,20,30,40};
		arr[1]=new int[] {12,23,67,87,89};
		for(int[] x1:arr)
		{
			for(int x:x1)
			{
				System.out.println(x);
			}
			System.out.println();
		}
	}
}
