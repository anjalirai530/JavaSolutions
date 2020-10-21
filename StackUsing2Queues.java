import java.util.*;
public class Stack {
     Queue<Integer> mainQ;
   
     Queue<Integer>helperQ;

    public Stack() {
        mainQ = new ArrayDeque<>();
      helperQ = new ArrayDeque<>();
        
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        return mainQ.size();
        //Implement the getSize() function
    }

    public boolean isEmpty() {
     if(mainQ.size() == 0){
         return true;
     }else{
         return false;
     }
        
    }

    public void push(int element) {
        while(mainQ.size() != 0){
            helperQ.add(mainQ.remove());
        }
        mainQ.add(element);
        while(helperQ.size() != 0){
            mainQ.add(helperQ.remove());
        }
       
    }

    public int pop() {
        if(mainQ.size() == 0){
            return -1;
        }
       return mainQ.remove();
        
    }

    public int top() {
          if(mainQ.size() == 0){
            return -1;
        }
        
       
      
        return mainQ.peek();
        
    }
}