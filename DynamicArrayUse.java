package MyObjectOriented;

import java.util.ArrayList;

public class DynamicArrayUse {

	public static void main(String[] args) {
		
		DynamicArray d = new DynamicArray();
		
		for(int i= 1 ;i<15;i++)
		{
			d.add(10+i);
		}
       System.out.println(d.size());
       System.out.println(d.get(2));
      // d.set(3,170);
      // System.out.println(d.get(3));
        d.insertAtIndex(50, 2);
       d.deleteAtIndex(2);
       while(!d.isEmpty())
       {
    	   System.out.println(d.removeLast());
    	   System.out.println("size - " + d.size());
    	   
       }
	}

}
