public class Solution {

    public static int Count( LinkedListNode<Integer> head)
	   {
	       int count=0;
	       LinkedListNode<Integer>p = head;
	       while(p!=null)
	       {
	           p=p.next;
	           count++;
	       }
	       return count;
	   }
    
	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		//Your code goes here
       LinkedListNode<Integer> p = head;
	  LinkedListNode<Integer> q = null;
	 
         
        if(pos<0 || pos >=Count(head))
            return head;
        if(pos == 0)
        {
            head = head.next;
        }
        else{
            for(int i = 0 ;i <= pos - 1 ;i++)
            {
                q=p;
                p=p.next;
            }
            q.next = p.next;
            p.data=-1;
        }
        return head;
	}
}