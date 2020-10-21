import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		//Your code goes here
        Stack <Integer> mainS = new Stack<>();
        Queue<Integer> helperQ = new ArrayDeque<>();
        int count = 1;
        while(count <= k){
            mainS.push(input.remove());
            count++;
        }
        while(input.size() != 0){
            helperQ.add(input.remove());
        }
        
        while(mainS.size() != 0){
            input.add(mainS.pop());
        }
        while(helperQ.size() != 0){
            input.add(helperQ.remove());
        }
        return input;
        
	}

}