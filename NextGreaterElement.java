import java.util.*;
public class nextGreater{

      public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          Stack<Integer> stack = new Stack<>();
          int n = s.nextInt();
          int arr[] = new int[n];
          for(int i=0;i<arr.length;i++)
          {
              arr[i] = s.nextInt();
          }
          int arr1[] = new int [n];
          arr1[arr1.length-1] = -1;
          stack.push(arr[arr.length-1]);
          for(int i = arr.length-2;i>=0;i--) 
          {
              while(stack.size() > 0 && arr[i]>stack.peek())
              {
                  stack.pop();
              }
              if(stack.size() ==0)
              {
                  arr1[i] = -1;
              }
              else 
              {
                  arr1[i] = stack.peek();
              }
              stack.push(arr[i]);
          }

          for(int i = 0;i<arr1.length;i++)
          {
              System.out.print(arr1[i] + " ");
          }

      }
}