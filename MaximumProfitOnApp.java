import java.util.*;
public class solution {

	public static int maximumProfit(int budget[]) {
        Arrays.sort(budget);
        
        int price[] = new int[budget.length];
        int n = budget.length;
        int i=0;
        for(i=0;i<budget.length;i++)
        {
            price[i] = budget[i]*n;
            n--;
        }
        int max = Integer.MIN_VALUE;
        for(i=0;i<budget.length;i++)
        {
            if(max<price[i])
                max =price[i];
        }
        return max;
        
		// Write your code here
        
        
        

	}

}
