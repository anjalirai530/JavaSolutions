public class Solution {

	public static int getSum(BinaryTreeNode<Integer> root) {
        if(root == null){
            return 0;
        }
		//Your code goes here.
       int ls = getSum(root.left);
       int rs = getSum(root.right);
       int ts = ls + rs + root.data;
        
        return ts;
	}

}