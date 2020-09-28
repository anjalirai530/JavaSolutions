import java.util.* ;
public class Solution {

	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		//Your code goes here
          if(input.size() <= 1)
              return;
        
          int temp = input.pop();
         reverseStack(input , extra);
        //recursion
         while(!input.isEmpty())
        {
           
             extra.push(input.pop());
        }
        input.push(temp);
        while(!extra.isEmpty())
        {
            
            input.push(extra.pop());
        }
	}
}