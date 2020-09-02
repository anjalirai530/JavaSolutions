import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t;
        long i=1;
        long sum=0;
        while(n != 0)
        {
            t = n % 2;
            sum = sum + i * t;
           
            i = i * 10;
             n = n / 2;
        }
        System.out.println(sum);
		// Write your code here

	}
}
