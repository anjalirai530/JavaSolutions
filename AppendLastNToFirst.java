public class Solution {

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		//Your code goes here
        if(n == 0 || head == null)
            return head;
        int i =0;
        LinkedListNode<Integer> head2 = head;
        LinkedListNode<Integer> curr = head;
        while(i < n)
        {
            if(curr.next != null)
               curr = curr.next;
            i++;
        }
         while(curr.next != null)
         {
             curr = curr.next;
             head2 = head2.next;
         }
        curr.next = head;
       LinkedListNode<Integer> tail = head2.next;
       head2.next = null;
       head = tail;
        return head;
       
	}

}