import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
   Scanner scn = new Scanner(System.in);
   int n = scn.nextInt();
   int arr[] = new int[n];
   for(int i = 0; i < n; i++){
       arr[i] = scn.nextInt();
   }
   HashMap<Integer,Boolean> hm = new HashMap<>();
   for(int val : arr){
       hm.put(val,true);
   }
   for(int val : arr){
       if(hm.containsKey(val - 1)){
           hm.put(val,false);
       }
   }
   int ml = 0;
   int mv = 0;
   for(int val : arr){
       if(hm.containsKey(val) == true){
           int nl = 1;
           int nv = val;
           
           while(hm.containsKey(nv + nl)){
               nl++;
           }
           if(nl > ml){
           ml = nl;
           mv = nv;
         }
       }
       
   }
   for(int i = 0; i < ml; i++){
       System.out.println(mv + i);
   }
 }

}