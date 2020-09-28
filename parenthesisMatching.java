import java.util.Stack;
public class Balanced{

  public static boolean isBalanced (String expression)
  {
      Stack <Character> stack = new Stack<>();
      for(int i = 0;i<expression.length();i++)
      {
          if(expression.charAt(i) == '(')
            stack.push(expression.charAt(i));
          else if(expression.charAt(i) == ')')
          {
              if(stack.size() == 0)
                return false;
              else if(expression.charAt(i) == ')' && stack.peek() == '(')
              {
                    stack.pop();
              }

          }
         
      }
      return stack.size() == 0;
  }



    public static void main(String[] args) {
        String str = "(())";
        System.out.println(isBalanced(str));
    }
}