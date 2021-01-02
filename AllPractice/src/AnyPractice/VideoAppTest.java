package AnyPractice;

public class VideoAppTest {
	
	public static int[] makeUniQueElementArray(int[] a)
	{
		int count=0;
		int duplicate=0;
	 
	 for(int i=0;i<a.length;i++)
	 {
		 for(int j=i+1;j<a.length;j++)
		 {
			 if(a[i]==a[j] && a[j]!=duplicate)
			 {
				 count++;
			 duplicate=a[j];
			 }
		 }
	 }
	int temp=0;
	boolean f=true;
	 int[] res=new int[a.length-count];
	 for(int i=0;i<a.length;i++)
	 {
		 for(int j=0;j<res.length;j++)
		 {
			 if(a[i]==res[j])
			 {
				 f=false;
				 break;
			 }
		
		 }
		 if(f==true)
		 {
			 res[temp]=a[i];
			 temp++;
			 
		 }
		 f=true;
	 }

	 return res;
	}

	public static void main(String[] args) {
		int[] ar={1,2,4,3,2,5,6,5};
		int[] res=makeUniQueElementArray(ar);
		for(int i=0;i<res.length;i++)
			System.out.print(" "+res[i]);
		

	}

}
