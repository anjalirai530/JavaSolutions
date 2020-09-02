import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t , sum = 0;
        while(n != 0)
        {
            t = n % 10;
            sum = sum * 10 + t;
            n = n / 10;
            
        }
        System.out.println(sum);
		// Write your code here

	}
}
