public class Solution {

	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root == null){
            return;
        }
        
        if(root.left != null && root.right != null){
            printNodesWithoutSibling(root.left);
            printNodesWithoutSibling(root.right);
        }else if(root.left != null){
            System.out.print(root.left.data + " ");
            printNodesWithoutSibling(root.left);
        }else if(root.right != null){
            System.out.print(root.right.data + " ");
            printNodesWithoutSibling(root.right);
        }
	}

}