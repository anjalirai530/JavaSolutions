public class Solution {

    
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		//Your code goes here
        //LinkedListNode<Integer>p =  head;
        LinkedListNode<Integer>curr =  head;
         LinkedListNode<Integer>prev = null;
         LinkedListNode<Integer>nexts = null;
         if(k == 0)
          return head;
       int count = 0; 
     
       /* Reverse first k nodes of linked list */
       while (count < k && curr != null)  
       { 
           nexts = curr.next; 
           curr.next = prev; 
           prev = curr; 
           curr = nexts; 
           count++; 
       } 
        if(nexts !=null)
            head.next = kReverse(nexts,k);
        return prev;
        
        
    }

}