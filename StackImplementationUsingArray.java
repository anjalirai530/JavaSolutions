***********************Main Class*******************
package Stack;

public class StackUse {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		
		StackUsingArray stack = new StackUsingArray(100);
		int arr[] = {5,6,7,8,9};
		
		for(int i = 0 ;i<arr.length;i++)
		{
			stack.push(arr[i]);
		}
		while(! stack.isEmpty())
		{
			System.out.println(stack.pop());
		}

		stack.size();
		System.out.println(stack.isEmpty());
		
	}

}






package Stack;

public class StackUsingArray {

    private int data[];
    private int topIndex; //index of the top most element of the stack
	
	public StackUsingArray() {
		data = new int[10];
		topIndex = -1;
	}
     public StackUsingArray(int size) {
    	 data = new int[size];
    	 topIndex = -1;
	}
	public int size() {

    			return topIndex+1;
	}
	
	//O(1)
     public boolean isEmpty() {

    	 return topIndex == -1;
     }
    //O(1);
	public void push(int elem) 
	{
		//If stack is full
		if(topIndex == data.length-1)
		{
			  System.out.println("Stack Overflow");
			
		}
		else {
			data[++topIndex] = elem;
			
		} 
	}
	
	//O(1);
	public int top()  {
		if(topIndex == -1)
			{
			    System.out.println("Stack Underflow");
			}
		return data[topIndex];
	}
	//O(1);
	public int pop()  {
		
		if(topIndex == -1)
		{
		  System.out.println("Stack Underflow");
		}
		
		int  x = data[topIndex--];
		
		
		return x;
			
	}
	
}
