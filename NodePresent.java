public class Solution {

	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    //Your code goes here
        if(root == null){
            return false;
        }
        if(root.data == x){
            return true;
        }
       boolean lf = isNodePresent(root.left,x);
        if(lf){
            return true;
        }
       boolean rf = isNodePresent(root.right,x);
        if(rf){
            return true;
        }
        return false;
	}

}