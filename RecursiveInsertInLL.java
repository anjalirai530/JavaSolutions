public static NodeR<Integer> insertR(NodeR<Integer>head,int val,int index)
	{
               if(head == null &&  index >0)
                     return head;
		
		if(index == 0)
		{
			NodeR<Integer>temp = new NodeR<Integer>(val);
			temp.next = head;
	
			return temp;
			
		}
		else {
			head.next= insertR(head.next,val,index -1);
	
			return head; 
		}
		
	}
	public static void main(String[] args) {
		
		
       NodeR <Integer>head= insertR(head,90,2);
        RecursivePrint(head);
	}

}
