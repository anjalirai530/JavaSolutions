public class Solution {

	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		//Your code goes here
        int count = 0;
        if(root == null){
            return 0;
        }
        if(root.data > x){
            count++;
        }
       int lc = countNodesGreaterThanX(root.left,x);
       int rc = countNodesGreaterThanX(root.right,x);
        
        return lc+rc+count;
	}

}