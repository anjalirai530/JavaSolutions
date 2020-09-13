public class DuplicateInArray{	

    public static int Maximum(int arr[])
    {
        int max = arr[0];
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    
	public static int duplicate(int[] arr){  
		
        int max = Maximum(arr);
        int A[] = new int[max+1];
        int i=0;
        for(i=0;i<arr.length;i++)
        {
            A[arr[i]]++;
        }
        for(i=0;i<max+1;i++)
        {
            if(A[i]>1)
                return i;
        }
        return -1;
	}
}