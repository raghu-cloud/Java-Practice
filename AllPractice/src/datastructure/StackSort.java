package datastructure;

import java.util.Stack;

public class StackSort {
	public static Stack<Integer> sortStack(int[] arr)
	{
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=0;i<arr.length;i++)
			stack.push(arr[i]);
		
		if(arr==null)
			return null;
		
		Stack<Integer> result=new Stack<Integer>();
		while(!stack.isEmpty() )
		{
			int smallest=stack.pop();
			while(!result.isEmpty() && smallest<result.peek() )
				stack.push(result.pop());
			result.push(smallest);
		}
		return result;
	}
	

	public static void main(String[] args) {
		int[] arr= {-1,-4,5,20};
		Stack<Integer> result;
		result=sortStack(arr);
		System.out.println(result);
	}
}
