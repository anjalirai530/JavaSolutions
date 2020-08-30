public class solution {
    
    public static Character highestOccuringCharacter(String input) {
    	//Your code goes here.
        int arr[] = new int[256];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=0;
        }
        for(int i=0;i<input.length();i++)
        {
            arr[input.charAt(i)]++;
        }
        int max = 0;
        char val  = ' ';
        for(int i=0;i<input.length();i++)
        {
            if(arr[input.charAt(i)]>max)
            {
                max=arr[input.charAt(i)];
                val = input.charAt(i);
            }
        }
        return val;
        
    }
}