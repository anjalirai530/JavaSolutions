import java.util.*;

public class StockSpan{
    public static int[] stockSpan(int price[])
    {
        Stack<Integer> stack= new Stack<Integer>();
        int arr[] = new int[price.length];
        arr[0] = 1;
        stack.push(0);
        for(int i = 0;i<price.length;i++)
        {
            while(!stack.isEmpty() && price[stack.peek()] < price[i])
                 stack.pop();
                
            if(stack.isEmpty())
            {
                stack.push(i);
                arr[i] = i+1;
            }
            else{
                arr[i] = i - stack.peek();
                stack.push(i);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int price[] = new int[n];
        for(int i = 0;i<price.length;i++)
        {
            price[i] = scn.nextInt();
        }
        int arr[] = stockSpan(price);
        for(int i=0;i<arr.length;i++)
          System.out.print(arr[i] + " " ) ;
    }
}