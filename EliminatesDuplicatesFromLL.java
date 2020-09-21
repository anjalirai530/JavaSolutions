public class Solution {

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head == null)
            return null;
        if(head.next == null)
            return head;
        LinkedListNode<Integer>p = head;
        LinkedListNode<Integer>q = head.next;
        while(q != null)
        {
            if(p.data.equals(q.data))
                q = q.next;
            else{
                p.next = q;
                p=q;
                q = q.next;
            }
        }
        p.next = q;
        return head;
	}