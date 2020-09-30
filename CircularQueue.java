import java.util.*;
public class QueueUsingArray{
    private int front;
    private int rear;
    private int data[];
    private int size;
  public  QueueUsingArray(){
        front=-1;
        rear = -1;
        data = new int[7];
        size = 0;
    }
    public int size(){
        return size;
    }
    public void enqueue(int elem)
    {
        if(size == data.length)
        {
            System.out.println("Overflow");
            return ;
        }
        if(size == 0)
        {
            front++;
        }
        // rear++;
        // if(rear == data.length)
        // rear = 0;
        //@Method to make queue as circular queue
        rear = (rear + 1)%data.length;
        data[rear] = elem;
        size++;
    }
    public int dequeue(){
        if(size == 0)
        return -1;
        int temp = data[front];
        //@Method to make queue as circular queue
         front = (front + 1)%data.length;
        //front++;
        // if(front == data.length)
        // front = 0;
        size--;
        return temp;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    
    public static void main(String[] args) {
        QueueUsingArray QueueUse  = new QueueUsingArray();
        int arr[] = {10,20,30,40,50,60,70};
        int i = 0;
        for(i =0 ;i<arr.length;i++)
        {
            QueueUse.enqueue(arr[i]);
        }
        System.out.println(QueueUse.size());
        while(!QueueUse.isEmpty())
        {
            System.out.print(QueueUse.dequeue() + " ");
        }
       
    }
}