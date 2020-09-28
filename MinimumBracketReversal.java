import java.util.Stack;
public class Solution {

	public static int countBracketReversals(String input) {
		//Your code goes here
        Stack <Character> stack = new Stack<>();
        if(input.length()%2 != 0)
            return -1;
        int i = 0;
        for(i = 0;i<input.length();i++)
        {
            if(input.charAt(i) =='}' && !stack.isEmpty())
            {
                if(stack.peek() =='{')
                    stack.pop();
                else
                    stack.push(input.charAt(i));
            }
            else{
                stack.push(input.charAt(i));
            }
        }
        int count = 0;
        while(!stack.isEmpty())
        {
            char c1 = stack.pop();
            char c2 = stack.pop();
            if(c1 == c2)
                count++;
            else
                count+=2;
        }
        return count;
            
	}

}