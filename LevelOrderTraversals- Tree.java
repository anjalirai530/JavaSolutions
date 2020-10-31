import java.io.*;
import java.util.*;
public class Solution {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
        Queue<BinaryTreeNode> mq = new ArrayDeque<>();
        
        mq.add(root);
        while(mq.size() != 0){
            int count = mq.size();
            for(int i = 0; i < count; i++){
                root = mq.remove();
                System.out.print(root.data + " ");
                
                if(root.left != null){
                    mq.add(root.left);
                }
                if(root.right != null){
                    mq.add(root.right);
                }
            }
            System.out.println();
        }
	}
	
}