import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
      Scanner  s = new Scanner(System.in);
		int n = s.nextInt();
		int sum=0,i=0;
		while(sum<=n)
		{
            i++;
			sum=i*i;
			
		}
		System.out.println(i-1);  
      }
}