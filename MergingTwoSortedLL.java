public class Solution {
    
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        //Your code goes here
        if(head1 == null)
            return head2;
         if(head2 == null )
            return head1;
        if(head1 == null && head2 == null)
            return null;
        //  if(head1 == null && head2 ==null)
        //     return null;
        LinkedListNode<Integer>p= head1;
        LinkedListNode<Integer>q = head2;
          LinkedListNode<Integer>head=null,tail=null;
        
      if(p.data < q.data)
      {
          head = p;
          tail = p;
          p = p.next;
      }else{
          head = q;
          tail = q;
          q = q.next;
      }
        while(p != null && q != null)
        {
            if(p.data < q.data)
            {
                tail.next = p;
                tail = p;
                p = p.next;
            }else{
                 tail.next = q;
                tail = q;
                q = q.next;
            }
        }
        if(p != null)
        {
            tail.next = p;
        }
        if(q != null)
        {
            tail.next =q;
        }
        return head;
        
    }

}