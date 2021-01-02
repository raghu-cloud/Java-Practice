package uttara.lab.arrays;

public class ArrayRefPass4 {
	public static void test(int[] i)
	{
		for(int j=0;j<i.length;j++)
			System.out.println(i[j]);
	}

	public static void main(String[] args) {
		int[] arr= {10,20,30,40};
		test(arr);
		
		

	}

}
