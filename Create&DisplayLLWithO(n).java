 


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


****************MAIN CLASS ***********************





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
                                last = head;o

			}
			else {
				else {
				last.next = temp;
				last = temp;
				
			}
			
			data = s.nextInt();
		}
		return head;
	}
	public static void main(String[] args) {
		Nodes <Integer> head = CreateList();
		print(head);

	}

}
