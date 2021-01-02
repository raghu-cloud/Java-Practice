package codefight;

public class AlternatingSum {
	static int[]  alternatingSums(int[] a) {
	    int sum1=0;
	    int sum2=0;
	    for(int i=0;i<a.length;i+=2)
	    {
	        sum1=sum1+a[i];
	    }
	    for(int i=1;i<a.length;i+=2)
	    {
	        sum2=sum2+a[i];
	    }
	    int[] res=new int[2];
	    res[0]=sum1;
	    res[1]=sum2;
	    return res;

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {50, 60, 60, 45, 70};
		int[] res=alternatingSums(arr);
		for(int i=0;i<res.length;i++)
			System.out.println(res[i]);

	}

}
