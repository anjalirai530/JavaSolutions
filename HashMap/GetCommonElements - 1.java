import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int arr1[] = new int[n1];
    for(int i = 0; i < n1; i++){
        arr1[i] = scn.nextInt();
    }
    int n2 = scn.nextInt();
    int arr2[] = new int[n2];
    for(int i = 0; i < n2; i++){
        arr2[i] = scn.nextInt();
    }
    HashMap<Integer,Integer> hm = new HashMap<>();
    for(int i = 0; i < n1; i++){
        if(hm.containsKey(arr1[i])){
            int ol = hm.get(arr1[i]);
            int nl = ol + 1;
            hm.put(arr1[i],nl);
        }else{
            hm.put(arr1[i],1);
        }
    }
    for(int i = 0; i < n2; i++){
        if(hm.containsKey(arr2[i])){
            System.out.println(arr2[i]);
            hm.remove(arr2[i]);
        }
    }
    
 }

}