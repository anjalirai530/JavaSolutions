public class Solution {

    public static void deleteAlternateNodes(Node<Integer> head) {
        //Your code goes here
        
        
        
        
        
        if (head == null)  
          return; 
  
       Node prev = head; 
       Node now = head.next; 
  
       while (prev != null && now != null)  
       {            
           /* Change next link of previus node */
           prev.next = now.next; 
  
           /* Free node */
           now = null; 
  
           /*Update prev and now */
           prev = prev.next; 
           if (prev != null)  
              now = prev.next; 
       }
    }
}