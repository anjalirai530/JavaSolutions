public class solution {
	public static void print2DArray(int input[][]) {
		// Write your code here
       int rows = input.length;
        int cols = input[0].length;
        int rw = 0;
        
        
        while(rw<rows){
        for(int i=rows-1-rw;i>=0;i--)
        {
               for(int j = 0;j<cols;j++){
                System.out.print(input[rw][j]+" ");
                
            } 
                System.out.println();
            }
            rw++;
            
        }
}