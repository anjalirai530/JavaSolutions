public class Solution {

public static int find(LinkedListNode<Integer> head, int n,int pos)
{   
    if(head==null)
      return -1;

    if(head.data==n)
    {
        return pos;
    }

    return find(head.next,n,pos+1);
    
}
	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
    	//Your code goes here
     
       return find(head,n,0);                                                

        
        
	}