public class Solution {

	public static int findNode(LinkedListNode<Integer> head, int n) {
		//Your code goes here
        LinkedListNode<Integer> p = head;
        int count = 0;
        while(p != null)
        {
           if(p.data == n)
           {
               return count;
           }
            p = p.next;
             count++;
        }
        return -1;
        
	}
}