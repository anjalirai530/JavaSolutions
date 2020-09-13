import java.util.Arrays;

public class Intersection{
	
	public static void intersection(int[] arr1, int[] arr2){
	
        
        
        
        Arrays.sort(arr1); 
        Arrays.sort(arr2); 

        
         int i = 0, j = 0; 
      
     while (i < arr1.length && j < arr2.length)  
     { 
                  
        if (arr1[i] > arr2[j])  
        { 
            j++; 
        }  
                  
        else 
        if (arr2[j] > arr1[i])  
        { 
            i++; 
        }  
        else 
        { 
            System.out.println(arr1[i]);
            i++; 
            j++; 
        } 
      }
    }
}
        