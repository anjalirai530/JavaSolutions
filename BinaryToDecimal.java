import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t,i=1,sum=0;
        while( n != 0)
        {
            t = n % 10;
            sum = sum + i * t;
            n = n / 10;
            i = i * 2;
        }
        System.out.println(sum);
		// Write your code here

	}
}
