import java.io.*;
import java.util.*;

public class Main {

  public static class PriorityQueue {
    ArrayList<Integer> data;

    public PriorityQueue() {
      data = new ArrayList<>();
    }

    public void add(int val) {
        data.add(val);
        upheapfy(data.size() - 1);
        
    }
      public  void upheapfy(int i){
          if(i == 0){
              return;
          }
          int pi = (i - 1)/2;
          
          if(data.get(pi) > data.get(i)){
              swap(i,pi);
              upheapfy(pi);
          }
      }
    public  void swap(int i,int j){
        int ith = data.get(i);
        int jth = data.get(j);
        
        data.set(i,jth);
        data.set(j,ith);
    }
    public int remove() {
     if(data.size() == 0){
            System.out.println("Underflow");
            return -1;
        }
        swap(0,data.size() - 1);
        int val = data.remove(data.size() - 1);
        downheapify(0);
        return val;
    }
    public void downheapify(int i){
        
        
        int min = i;
        int left = 2 * i + 1;
        if(left < data.size() &&
        data.get(left) < data.get(min)){
            min = left;
        }
        int right = 2 * i + 2;
        if(right < data.size() &&
        data.get(right) < data.get(min)){
            min = right;
        }
        
        if(min != i){
            swap(i,min);
            downheapify(min);
        }
    }

    public int peek() {
        if(size() == 0){
            System.out.println("Underflow");
            return -1;
        }
        return data.get(0);
    }

    public int size() {
     return data.size();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue qu = new PriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}