package codefight;

public class Matrix {
	
	
	static void matrixElementsSum(int[][] matrix)
	{
		for(int i=0;i<matrix.length;i++)
	    {
	    	for(int j=0;j<matrix[i].length;j++)
	    	{
	    		System.out.print(matrix[i][j]+" ");
	    		if(j==matrix[i].length-1) {
	    			System.out.println("");
	    		}
	    	}
	    }
		
		System.out.println("------------");
		
	    for(int i=0;i<matrix.length;i++)
	    {
	        for(int j=0;j<matrix[i].length;j++)
	        {
	            if(matrix[i][j]==0)
	            {
	            	matrix[i+1][j]=0;
	                 
	            }
	        }
	    }
	    
	    
	    for(int i=0;i<matrix.length;i++)
	    {
	    	for(int j=0;j<matrix[i].length;j++)
	    	{
	    		System.out.print(matrix[i][j]+" ");
	    		if(j==matrix[i].length-1) {
	    			System.out.println("");
	    		}
	    	}
	    }
	    
	    
	    
	    
	    
	    
	   

	}

	public static void main(String[] args) {
		int[][] arr= {{0, 1, 1, 2},{0, 5, 0, 0},{2, 0, 3, 3}};
		matrixElementsSum(arr);
		

		

	}

}
