import java.io.*;
import java.util.*;
public class DuplicateBraces{

    public static boolean Duplicates(String str)
    {
        Stack<Character> stack  = new Stack <>();
        for(int i = 0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch == ')'){
               if(stack.peek() == '(')
               {
                   return true;
               }
               else{
                   while(stack.peek() != '(')
               {
                  stack.pop(); 
               }
               stack.pop();
               }
            }
            else{
                stack.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
   
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(Duplicates(str));
    }
}