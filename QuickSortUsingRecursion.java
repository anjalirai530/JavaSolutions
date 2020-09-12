package Recursion;
import java.util.Scanner;
public class QuickSort {

	public static int partioning(int A[],int l,int h)
	{
		int count = 0 ;
		int pivot = A[l];
		for(int  i = l+1;i<=h;i++)
		{
			if(A[i] <= pivot)
				count++;
		}
		int pivotIndex = l + count;
		A[l] = A[pivotIndex];
		A[pivotIndex] = pivot;
		int i=l,j=h;
		while(i < j)
		{
			while(i <=h && A[i] <= pivot)
			{
				i++;
			}
			if(j<= h && A[j]>pivot)
			{
				j--;
			}
			if(i <= j)
			{
				int temp =A[i];
				A[i] = A[j];
				A[j] = temp;
				i++;
				j--;
			}
		}
		
		return pivotIndex;
		
		
	}
	public static void QuickSorts(int A[],int l,int h)
	{
		int j;
		if(l < h)
		{
			j = partioning(A,l,h);
			QuickSorts(A,l,j-1);
			QuickSorts(A,j+1,h);
			
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
		int h = A.length-1;
		
		QuickSorts(A,l,h);
		printArray(A);
		
	}

}
