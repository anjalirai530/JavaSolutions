package Recursion;
import java.util.Scanner;
public class TowerOfHanoi {
    public static void Tower(int n,char a,char b,char c)
    {
    	if(n>0)
    	{
    		Tower(n-1,a,c,b);
    		System.out.println(a + " " + c);
    		Tower(n-1,b,a,c);
    	}
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		Tower(n,'A','B','C');

	}

}
