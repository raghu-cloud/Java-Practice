package uttara.lab.arrays;



import java.util.Random;

public class RandomInterger3
{
	public static void main(String[] args)
	{
		int[] arr=new int[10];
		Random rand=new Random();

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=rand.nextInt(100);
		}
		
		System.out.println("Printing array elements in a normal for loop");
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		
		
		System.out.println("Ptrinting array elements in for each loop");
		for(int x : arr)
		{
		System.out.println(x);
		}





	}

}