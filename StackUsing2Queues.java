import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static void reverseQueue(Queue<Integer> input) {
		//Your code goes here
        Stack<Integer> st = new Stack<>();
        while(input.size() != 0){
            st.push(input.remove());
        }
        while(st.size() != 0){
            input.add(st.pop());
        }
	}

}