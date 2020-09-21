package DataStructures.LinkedList;
import java.util.Scanner;
public class NodeRUse {

	public static NodeR<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		NodeR<Integer> head = null;
		NodeR<Integer> last = head;
		while(data != -1)
		{
			NodeR<Integer> temp = new NodeR<Integer>(data); 
			if(head == null)
			{
				head = temp;
				last = head;
			}
			else {
				last.next = temp;
				last = temp;
			}
			data = s.nextInt();
		}
		return head;
		
		
		
	}
	public static void RecursivePrint(NodeR<Integer>head) {
		if(head == null)
			return;
		else
			System.out.print(head.data + " ");
		
		RecursivePrint(head.next);
	}
	public static void main(String[] args) {
		NodeR <Integer>head = takeInput();
		RecursivePrint(head);

	}

}
