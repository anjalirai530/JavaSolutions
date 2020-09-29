import java.util.*;
public class QueueUsingArray{
    private int data[];
    private int frontIndex;
    private int rearIndex;
    private int size;

    QueueUsingArray(){
        data = new int[10];
        frontIndex = -1;
        rearIndex = -1;
    }
    QueueUsingArray(int Capacity){
        data = new int[Capacity];
        frontIndex = -1;
        rearIndex = -1;
        
    }
    public  int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int front(){
        if(size == 0)
           return -1;
       else
         return data[frontIndex];
    }
    public  void Enqueue(int elem){
        if(size == data.length)
        {
            System.out.println("Queue Overflow");
            return;
        }
         if(size == 0)
        {
           
            frontIndex++;
        }
        
            rearIndex++;
            data[rearIndex] = elem;
            size++;
        

    }
    public  int Dequeue()
    {
        
        if(size == 0)
        {
            frontIndex = rearIndex =-1;
            return -1;
        }
        int temp = data[frontIndex];
        frontIndex++;
        size--;
        
        return temp;
        

    }




    public static void main(String[] args) {
        QueueUsingArray QueueUse  = new QueueUsingArray();
        int arr[] = {10,20,30,40,50,60,70};
        int i = 0;
        for(i =0 ;i<arr.length;i++)
        {
            QueueUse.Enqueue(arr[i]);
        }
        System.out.println(QueueUse.size());
        while(!QueueUse.isEmpty())
        {
            System.out.print(QueueUse.Dequeue() + " ");
        }
       
    }
}