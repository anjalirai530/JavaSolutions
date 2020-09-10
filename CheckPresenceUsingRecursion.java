package Recursion;

import java.util.Scanner;

public class CheckElement {

	public static boolean CheckPresence(int A[],int l,int h,int x) {
		if(h < l)
			return false;
		if(x == A[l])
			return true;
		if(x == A[h])
			return true;
		else
			return CheckPresence(A,l+1,h-1,x);
	}
	
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		int n = s.nextInt();
		int A[] = new int[n];
		for(int i = 0;i<n;i++)
			A[i] = s.nextInt();
		int l = 0;
		int h = n-1;
		int x = s.nextInt();
		System.out.println(CheckPresence(A,l,h,x));
		
	}

}
