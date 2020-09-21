public class Solution {
    

    public static LinkedListNode<Integer> Reverse(LinkedListNode<Integer> root) {
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
        return root;
	}


	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head ==null || head.next == null) 
            return true;
        
        LinkedListNode<Integer> front = head; 
        LinkedListNode<Integer> back = head; 
        
        while(front.next!=null && front.next.next!=null)
        {
            front = front.next.next;
            back = back.next;
        }
        
        
          
        LinkedListNode<Integer> head2 = back.next;
        back.next = null;
        LinkedListNode<Integer> p = Reverse(head2);
        LinkedListNode<Integer> q = head;
        int flag = 0;
        while(p != null && q != null)
        {
            if(p.data != q.data)
            {
               return false;
                
            }
          
            p=p.next;
            q=q.next;   
           
        }
    return true;
        
	}

}