package codefight;

public class ArrayIncreament {
	static boolean  almostIncreasingSequence(int[] sequence) {
		int[] an=new int[sequence.length];
		for(int i=0;i<sequence.length;i++)
		{
			an[i]=sequence[i];
		}
		int max=-2000; 
		int anMax=-2000;
		int maxPos=0;
		int arrMax1=-2000;
		int arrMax2=-2000;
		for(int i=0;i<sequence.length;i++)
		 {
			 if(sequence[i]>max)
			 {
				 max=sequence[i];
				 maxPos=i;
			 }
			 else
			 {
				 sequence[maxPos]=0;
				 max=sequence[i];
				 break;
			 }
		 }
		
		for(int i=0;i<an.length;i++)
		 {
			 if(an[i]>anMax)
			 {
				 anMax=an[i];
			 }
			 else
			 {
				 an[i]=0;
				 break;
			 }
			 
		 }
	
		
		for(int i=0;i<sequence.length;i++)
		{
			if(sequence[i]==0)
			{
				for(int j=i;j<sequence.length-1;j++)
				{
					sequence[j]=sequence[j+1];
					sequence[j+1]=0;
				}
			}
		}
		
		
		
		for(int i=0;i<an.length;i++)
		{
			if(an[i]==0)
			{
				for(int j=i;j<an.length-1;j++)
				{
					an[j]=an[j+1];
					an[j+1]=0;
				}
			}
		}
		
		
		int[] arr1=new int[sequence.length-1];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sequence[i];
		}
		
		
		
		int[] arr2=new int[sequence.length-1];
		for(int i=0;i<arr2.length;i++)
		{
			if(an[i]!=0)
			{
				arr2[i]=an[i];
			}
		}
		
		
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]>arrMax1)
			{
				arrMax1=arr1[i];
			}
			else
			{
				for(int j=0;j<arr2.length;j++)
				{
					if(arr2[j]>arrMax2)
					{
						arrMax2=arr2[j];
					}
					else
						return false;
				}
                break;
			}
		}
		return true;
    
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] i= {1, 2, 3, 4, 3, 6};
		boolean b=almostIncreasingSequence(i);
		System.out.println(b);
		//almostIncreasingSequence(i);

	}

}
