public class Solution {

	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head )
	{
        
		LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> t1 = head,t2 = head, t3 = head;
        if(t2  == null)
            return t2;
        t2 = t2 .next;
        while(t3 !=null){
            while(t2 !=null){
                if(t1.data >t2.data)
                {
                    int tempor=t1.data;
                    t1.data = t2.data;
                    t2.data = tempor;
                }
                t1=t1.next;
                t2=t2.next;
            }
            t1=temp;
            t2=temp;
            t3 =t3.next;
            t2=t2.next;
        }
        return temp;
   }
}