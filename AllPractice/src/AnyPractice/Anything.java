package AnyPractice;

public class Anything {
	static 
	{
		System.out.println("Anything class is loaded");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i= {10,20,30};
		int[] j= {20,30};
		j=i;
		for(int k:j)
			System.out.println(k);
		
		for(int z=0;z<args.length;z++)
		{
			System.out.println(args[z]);
		}

	}

}
