public class Solution {

	public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
		//Your code goes here
     
        if(head == null|| head.next ==null )
        {
            
            return head;
        }
       
        
        LinkedListNode<Integer> smallHead =  reverseLinkedListRec(head.next);
        LinkedListNode<Integer> tail    = head.next ;
         tail.next = head;
        head.next = null;

       return smallHead;
        
	}

}