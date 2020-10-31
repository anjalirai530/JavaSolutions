public class Solution {

	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
        if(root == null){
            return;
        }
        BinaryTreeNode<Integer> temp;
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
        
        temp= root.left;
        root.left = root.right;
        root.right = temp;
        
        
	}
	
}