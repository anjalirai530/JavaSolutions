*************************************************************Main Class*************************************************************************
 package Stack;

public class StackUse {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		
		
	    StackUsingLL<Integer> stack = new StackUsingLL<>();	
		
		
		
		
		//StackUsingArray stack = new StackUsingArray();

		int arr[] = {5,6,7,1,9};
		
		for(int i = 0 ;i<arr.length;i++)
		{
			stack.push(arr[i]);
		}
		while(! stack.isEmpty())
		{
			System.out.println(stack.pop());
		}

		
	}

}




















package Stack;

import DataStructures.Node;

public class StackUsingLL <T> {
	
	private Node<T >head;
	private int size;
	
	public StackUsingLL() {
		head = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	public void push(T elem){
		Node<T>newNode = new Node<T>(elem);
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public T top() throws StackEmptyException {
		if(head == null)
		{
			throw new StackEmptyException();
		}
		return head.data;
	}
	
	public T pop() throws StackEmptyException {
		if(head == null)
		{
			throw new StackEmptyException();
		}
		T x = head.data;
		head = head.next;
		size--;
		return  x;
		
	}

}
