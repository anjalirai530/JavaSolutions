import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
     int prev = s.nextInt();
    int i = 1;
    boolean isIncr = false;

    while(i < n){

        int curr = s.nextInt();

        int diff = curr - prev;
        
        if(diff == 0){  
            System.out.println("false");
            return;
        }else if(diff > 0){  
            isIncr = true;
        }else if(isIncr  && diff < 0){
          
                             System.out.println("false");
           return;
        }

        prev = curr;
       i=i+1;

    }

     System.out.println("true");
    }
}
