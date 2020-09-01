public class Solution {

	public static void leaders(int[] input) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
        int len = input.length;
        int j;
//         
        for(int i = 0;i<len;i++){
            for(j = i+1;j<len;j++)
            {
                if(input[i]<input[j])
                    break;
            }
            if(j==len)
                System.out.print(input[i]+" ");
        }
	}
	
}