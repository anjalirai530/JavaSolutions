public class Solution {

	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
      if(head==null||head.next==null)
      {
          return head;
      }
        LinkedListNode<Integer> slow=head;
        LinkedListNode<Integer> fast=head.next;
		while(fast!=null&&fast.next!=null)
        {
          slow=slow.next;
          fast=fast.next.next;
        }
        LinkedListNode<Integer> temp1=slow.next;
        slow.next=null;
        head=mergeSort(head);
        temp1=mergeSort(temp1);
     LinkedListNode<Integer> newNode= merge(head,temp1);
        return newNode;
        
}
    public static LinkedListNode<Integer> merge(LinkedListNode<Integer> head1,LinkedListNode<Integer> head2 ){
        LinkedListNode<Integer> t1=head1;
        	LinkedListNode<Integer> t2=head2;
        	LinkedListNode<Integer> answer=null;
           if(t1.data<=t2.data)
           {
               answer=t1;
               t1=t1.next;
              
           }
           else
           {
            answer=t2;
            t2=t2.next;
            }
			LinkedListNode<Integer> head=answer;
        	LinkedListNode<Integer> tail=answer;
        while(t1!=null&&t2!=null)
        {
            if(t1.data<=t2.data)
            {
                tail.next=t1;
                tail=t1;
                t1=t1.next;
                
            }
            else
            {
                tail.next=t2;
                 tail=t2;
                t2=t2.next;
               
            }
        }
        if(t1!=null)
        {
            tail.next=t1;
        }
        if(t2!=null)
        {
            tail.next=t2;
        }
        return head;
	}
    }