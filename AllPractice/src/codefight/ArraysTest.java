package codefight;

public class ArraysTest {
	public static int makeArrayConsecutive2(int... statues) {
	    int minimum=statues[0];
	    int maximum=statues[statues.length-1];
	    int x=0;
	    int count=0;
	    for(int i=0;i<statues.length;i++)
	    {
	        if(statues[i]<minimum)
	        {
	            minimum=statues[i];
	        }
	    }
	    int e=minimum;
	    for(int i=0;i<statues.length;i++)
	    {
	        if(statues[i]>maximum)
	        {
	            maximum=statues[i];
	        }
	    }
	    while(e<maximum)
	    {
	        
	        for(int i=0;i<3;i++)
	        {
	            for(int j=0;j<statues.length;j++)
	            {
	                if(statues[j]==e)
	                e=e+1;
	             }
	         }
	       if(e<maximum) {
	           count++;
	            e=e+1;
	       }
	       

	         
	        
	    }
	    System.out.println(count);
	    return count;
	    
	    
	    

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeArrayConsecutive2(5, 4, 6);
		}

}
