package Recursion;
import java.util.Scanner;
public class MergeSortRecursion {
    
	public static void Merging(int input[],int l,int mid,int h)
	{
		int i = l;
		int j = mid + 1;
		int k = l;
		int B[] = new int[input.length];
		
		while(i <= mid && j <= h)
		{
			if(input[i]>input[j])
			{
				B[k++] = input[j++];
			}
			else {
				B[k++] = input[i++];
			}
		}
		for(;i<=mid;i++)
			B[k++] = input[i];
		for(;j<=h;j++)
			B[k++] = input[j];
		
		for(i=l;i<=h;i++)
		
				input[i] = B[i];
	}
	
	public static void MergeSort(int input[],int l,int h)
	{
		
		if(l < h)
		{
			int mid = (l + h)/2;
			MergeSort(input,l,mid);
			MergeSort(input,mid+1,h);
			Merging(input,l,mid,h);
		}
	}
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s  = new Scanner(System.in);
		int n = s.nextInt();
		int A[] = new int[n];
		for(int i = 0;i<n;i++)
			A[i] = s.nextInt();
      int l = 0;
      int  h = A.length-1;
      MergeSort(A,l,h);
      printArray(A); 
      
      
	}

}
