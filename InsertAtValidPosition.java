




package DataStructures.LinkedList;

import DataStructures.Node;

public class Nodes<T> {
    
	T data;
	Nodes<Integer> next;
	
	Nodes(T data)
	{
		this.data = data;
	}
        
}





**********************MAIN CLASS *******************************



package DataStructures.LinkedList;
import java.util.Scanner;
import DataStructures.Node;

public class NodesUse {

	public static void print(Nodes<Integer>head )
	{
		Nodes <Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
		
		
	}
	public static Nodes<Integer> CreateList(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		 Nodes<Integer> head = null;
		 Nodes<Integer> last = head;
		
		while(data != -1)
		{
			 Nodes<Integer> temp = new Nodes<Integer>(data);
			
			if(head == null)
			{
				//make this node as head node
				head = temp;
				last = head;
			}
			else {
				last.next = temp;
				last = temp;
				//with bad time complexity - O(n^2)
//				 Nodes<Integer> tail = head;
//				 while(tail.next != null)
//				 {
//					 tail = tail.next;
//				 }
//				 //now tail will refer to last node
//				 //connect current node after last node
//				 tail.next = temp;
				
			}
			
			data = s.nextInt();
		}
		return head;
	}
	 public static int Count(  Nodes<Integer> head)
	   {
	       int count=0;
	       Nodes<Integer> p = head;
	       while(p!=null)
	       {
	           p=p.next;
	           count++;
	       }
	       return count;
	   }
	public static void InsertLL(Nodes<Integer>head,int pos,int data)
	{
		Nodes<Integer> p = head;
		Nodes<Integer> temp = new  Nodes<Integer>(data);
         
        if(pos<0 || pos > Count(head))
            return;
        if(pos == 0)
        {
           temp.next = head;
           head = temp;
            
        }
        else{
            for(int i = 0 ;i < pos - 1 ;i++)
            {
                p=p.next;
            }
            
            temp.data=data;
            temp.next = p.next;
            p.next = temp;
            
        }
        print(head);
		
	}
	public static void main(String[] args) {
		Nodes <Integer> head = CreateList();
		InsertLL(head,0,80);
		
	}

}
