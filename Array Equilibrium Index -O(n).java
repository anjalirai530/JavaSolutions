public class ArrayEquilibrium{	
	//arr is the given array in which you need to find the equilibrium index
	public static int arrayEquilibrium(int[] arr){  
		//write your code here
        int total_sum = 0,i=0;
        int left_sum=0,index=0,right_sum=0;
        while(i<arr.length)
        {
            total_sum += arr[i];
            i=i+1;
        }
        while(index<arr.length){
            right_sum = total_sum -left_sum - arr[index];
            
            if(left_sum == right_sum)
                return index;
            left_sum = left_sum+arr[index];
            index = index +1;
        }
        return -1;
        
	}
}