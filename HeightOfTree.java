public class Solution {

	public static int height(BinaryTreeNode<Integer> root) {
		//Your code goes here
       if(root == null){
           return  0;
       } 
      int lh = height(root.left);
      int rh =  height(root.right);
       int th = Math.max(lh,rh);  
       return th+1; 
	}

}