public class Solution {
    
    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        //Your code goes here
        if(head == null)
            return null;
        if(head.next == null)
            return head;
        LinkedListNode<Integer>p= head;
        LinkedListNode<Integer> q=head;
        while(p.next!=null && p.next.next!=null)
        {
            
            p = p.next.next;
            q=q.next;
            
        }
        return q;
        
    }

}