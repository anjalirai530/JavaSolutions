package Practise;
import java.util.Scanner;
public class AverageMarks {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char ch = str.charAt(0);
		
		int m1 = s.nextInt();
		int m2 = s.nextInt();
		int m3 = s.nextInt();
		float avg = m1+m2+m3/3;
		System.out.println(ch);
		System.out.println(avg);

	}

}
