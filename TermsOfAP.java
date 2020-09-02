package Practise;
import java.util.Scanner;
public class TermsOfAP {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0,count=0;
		for(int i=1;count<=n;i++)
		{
			sum = 3*i+2;
			if(sum%4!=0)
			{
				System.out.print(sum + " ");
				count++;
			}
		}

	}

}
