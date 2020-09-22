public class Solution {

	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		//Your code goes here
        LinkedListNode<Integer>p= head;
        LinkedListNode<Integer> oddHead=null,oddTail=null,evenHead=null,evenTail=null;
        while(p != null)
        {
            if(p.data % 2 ==0)
            {
                if(evenHead == null)
                {
                    evenHead = p;
                    evenTail = p;
                }
                else{
                    evenTail.next = p;
                    evenTail = p;
                }
               
            }
           else if(p .data %2!=0)
            {
                if(oddHead == null)
                {
                    oddHead = p;
                    oddTail = p;
                }
                else{
                    oddTail.next = p;
                    oddTail = p;
                }
                
            }
            p = p.next;
        }
        if(evenTail == null)
            return oddHead;
        if(oddTail == null)
            return evenHead;
        oddTail.next = null;
        evenTail.next = null;
        oddTail.next = evenHead;
        
        return oddHead;
        
	}
}