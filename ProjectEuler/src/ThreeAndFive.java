
public class ThreeAndFive {
	public int sum;
	
	public int test() {
		int [] arr=new int[1000];
		for(int i=0;i<1000;i++)
		{
			arr[i]=i+1;
		}
		for(int i=0;i<1000;i++)
		{
			if(arr[i]%3==0 || arr[i]%5==0)
			{
				sum=arr[i]+sum;
			}
				
		}
		return sum;
	}
	
	
	
	

	public static void main(String[] args) {
		ThreeAndFive t=new ThreeAndFive();
		System.out.println(t.test());
		
		
		

	}

}
