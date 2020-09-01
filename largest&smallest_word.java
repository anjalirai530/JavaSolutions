package arrays2d;
import java.util.Scanner;
public class SmallestLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String large="",small="",word="";
		String array[] = new String[1000];
		String str = sc.nextLine();
		int length = 0;
		for(int i=0; i <str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				word = word + str.charAt(i);
			}
			else {
				array[length] = word;
				length++;
				word="";
			}
		}
		small= large=array[0];
		for(int k=0;k<length;k++)
		{
			if(small.length()>array[k].length())
			{
				small=array[k];
			}
			if(large.length()<array[k].length())
			{
				large=array[k];
			}
			
		}
		
		 System.out.println("Smallest word: " + small);    
	      System.out.println("Largest word: " + large);
	}

}
