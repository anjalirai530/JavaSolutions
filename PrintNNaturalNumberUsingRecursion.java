package Recursion;
import java.util.Scanner;
public class PrintNaturalNumbers {

	
	public static void Print(int n)
	{
		if(n == 0)
			return;
		else
		{
			Print(n-1);
			System.out.print(n + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Print(10);
	}

}
