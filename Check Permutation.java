public class solution {

	public static boolean isPermutation(String input1, String input2) {
	    // Write your code here
        
        int arr[] = new int[256];
        for(int i=0;i<arr.length;i++)
            arr[i]=0;
        for(int i=0;i<input1.length();i++)
        {
            arr[input1.charAt(i)]++; 

        }
        for(int i=0;i<input2.length();i++)
        {
            arr[input2.charAt(i)]--;
        }
        int flag=0;
     for(int j=0;j<256;j++)
        {
            
            if(arr[j]==0)
            {
               flag=1;
            }
            else{
                flag=0;
                break;
            }
        }
        if(flag==0)return false;
        else
            return true;
    
  }
}
