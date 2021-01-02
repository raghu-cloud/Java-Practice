package practice.computer.local;




public class FiveAndThree {
	
	public static int[] test(int [] nums)
	{
		int e=0;
		int[] result=new int[nums.length];
		
		for(int j=0;j<nums.length;j++)
		{
			if(nums[j]%2==0)
			{
				result[e]=nums[j];
				e++;
			}
		}
		
		for(int k=0;k<nums.length;k++)
		{
			if(nums[k]%2!=0)
			{
				result[e]=nums[k];
				e++;
			}
		}
		
		return result;
	}
	
	
	
	
	
	
	


	public static void main(String[] args) {
		int[] a= {4,5,3,5,6,7,8,8,5,3,5,7,8};
		int[] res=test(a);
		for(int b:res)
			System.out.println(b);
		
		
		
		
		}
	}
