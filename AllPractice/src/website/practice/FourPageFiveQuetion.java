package website.practice;


public class FourPageFiveQuetion {
	public static int[] copyEvens(int[] nums, int count) {
		int j=0;
		int[] result=new int[count];
		for(int i=0;i<nums.length;i++)
		{
		 if((nums[i]%2)==0)
		 { 
		  if(j<count) {
		  result[j]=nums[i];
		  j++;
		  }
		 }
		}
		return result;
		}
	
	
	

	
	
	
     public static String endUp(String str) {
		int i=str.length();
		String s1=str.substring(0,i-3);
		String s2=str.substring(i-3);
		String s3=s2.toUpperCase();
		String result=s1+s3;
		return result;
	}
	
	
	
     
     
	public static String twoChar(String str, int index) {
		int i=str.length();
		String result=new String(" ");
		if(i>3 && index<i-2)
		result=str.substring(index,index+2);
		else
		result=str.substring(0,2);

		return result.trim();
		  
		}
	
	
	
	
	
	public int[] zeroMax(int[] nums) {
		for(int i=0;i<nums.length;i++) 
				{
					if(nums[i]==0) 
					{
		                               int ld=0;
						for(int j=i;j<nums.length;j++)
						{
		                                         
							if(nums[j]>ld && nums[j]%2!=0)
							ld=nums[j];
		                                        nums[i]=ld;
						}
		                                 
		                                
					}
					
				}
				
				return nums;
		}
	
	
	
	
	//second method of the zeroMax
	public static int[] zeroMax1(int[] nums) {
		for(int i=0;i<nums.length;i++) 
				{
					if(nums[i]==0) 
					{
						for(int j=i;j<nums.length;j++)
						{                    
							if(nums[j]%2!=0)
							{
								int[] arr= {nums[j]};
								int maxNo=0;
								for(int t=0;t<arr.length;t++)
								{
									if(arr[t]>maxNo)
									{
										maxNo=arr[t];
										nums[i]=maxNo;
									}
								}
									
							}
							
						}
		                                 
		                                
					}
					
				}
				
				return nums;
		}
	
	
	
	
	
	public static String makeAbba(String a, String b) {
		String s1=a+b;
		String result=s1+b+a;
		
		return result;
	}

	
	
	
	
	
	public static String startWord(String str, String word) {
		String result= new String(" ");
		if(word.length()==1) {
			if(str.charAt(1)==word.charAt(0))
			{
				result=str.substring(0,1);
				return result;
			}
            }
		
		if(word.length()>1)
		{
			if(str.charAt(0)==word.charAt(0))
			{
				for(int i=0;i<word.length();i++)
				{
					if(str.charAt(i)==word.charAt(i))
					{
						result=str.substring(0, word.length());
						return result;
					}
				}
			}
			
			if(str.charAt(0)!=word.charAt(0))
			{
				if(str.charAt(1)==word.charAt(1))
				{
					for(int i=0;i<word.length();i++)
					{
						if(str.charAt(i)==word.charAt(i))
						{
							result=str.substring(0, word.length());
							return result;
						}
					}
				}

			}
			
		}
		return str;
	}
	
	
	
	
	
	public static int[] notAlone(int[] nums, int val)
	{
	for(int i=0;i<nums.length;i++)
	  {
	   if(((i-1)>=0)  && ((i+1)<nums.length))
	   {
	    if((nums[i]==val) && (nums[i-1]!=val) && (nums[i+1]!=val))
	    {
	     int j=nums[i-1];
	     int k=nums[i+1];
	     if(j>k)
	     nums[i]=j;
	     else 
	     nums[i]=k;
	    }
	   }
	  }
	   return nums;
	 }

	
	
	


	
	
	
	
		
	public static void main(String[] args)
	{
		/*copyEven
		 int[] arr= {3, 2, 4, 5, 8};
		int[] res=copyEvens(arr,2);
		for(int i=0;i<res.length;i++)
		System.out.println(res[i]);*/
		
		
		/*endUp
		 String result=endUp("hio");
		System.out.println(result);*/
		
		
		/*twoChar
		 String s0=twoChar("java",3);
		System.out.println(s0);*/
		
		
		/*zeroMax
		int[] i1= {0,4,0,3};
		int[] arr=zeroMax(i1);
		for(int k=0;k<arr.length;k++)
			System.out.println(arr[k]);*/ 
		
		
		/*makeabba
		String str=makeAbba("Hi","Bye");
		System.out.println(str);*/
		
		
		/*startWord
		String str=startWord("hippo","i");
		System.out.println(str);*/
		
		
		/*notAlone
		int[] arr= {3,4};
		int[] result=notAlone(arr,2);
		for(int d:result)
			System.out.print(d);*/
		
		
		
	
		
	}


}
