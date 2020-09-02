import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
    Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int first=0;
        int second=1;
        int sum=0;
        for(int i=2;i<=n;i++)
        {
            sum=first+second;
            first=second;
            second=sum;
        }
        System.out.println(sum);
        
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		
	}

}
