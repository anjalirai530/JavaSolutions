
	public static void printIthNode(LinkedListNode<Integer> head, int i){
		
         LinkedListNode<Integer> temp = head;
        int count = 0;
        while(temp != null)
        {
            if(count == i)
                System.out.println(temp.data);
            temp = temp.next;
             count ++ ;
        }
        
        
	}
}