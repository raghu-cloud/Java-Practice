package codefight;

public class RemoveArrayElement {
	public static void  almostIncreasingSequence(int... sequence) {
	    int[] result=new int[sequence.length-1];
	    int temp=0;
	    boolean flag=true;
	    for(int i=0;i<sequence.length-1;i++)
	    {
	        if(sequence[i+1]>sequence[i] )
	        {
	            
	        }
	        if(sequence[i+1]<sequence[i])
	        {
	            temp=i;
	           flag=false;
	        }
	    }
	    
	    if(flag==false)
	    {
	        for(int i=temp;i<sequence.length-1;i++)
	        {
	            sequence[i]=sequence[i+1];
	        }
	    }
	    for(int c:sequence)
	    {
	    	System.out.println(c);
	    }
	     
	    

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		almostIncreasingSequence(1, 3, 2, 1);

	}

}
