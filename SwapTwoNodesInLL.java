public class Solution {

	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
		//Your code goes here
        LinkedListNode<Integer>p= head;
        LinkedListNode<Integer>q = head;
        int countp = 1,countq=1;
        while(countp <=i)
        {
            p = p.next;
            countp++;
        }
        while(countq <=j)
        {
            q = q.next;
            countq++;
        }
        int temp = p.data;
        p.data = q.data;
        q.data =temp;
        
        return head;
        
	}