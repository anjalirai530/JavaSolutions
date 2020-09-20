/*

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*/

public class Solution {

    public static void print(LinkedListNode<Integer>root )
	{
		LinkedListNode<Integer> temp = root;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
		
		
	}
    
	public static void printReverse(LinkedListNode<Integer> root) {
		//Your code goes here
        LinkedListNode<Integer> p = root;
        LinkedListNode<Integer> q = null;
        LinkedListNode<Integer> r = null;
        while(p != null)
        {
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
      
        root = q;
        print(root);
	}
   

}