public class Solution {
    public static BinaryTreeNode Insert(BinaryTreeNode<Integer>root){
        if(root == null){
            return null;
        }
       

        
        BinaryTreeNode ln = Insert(root.left);
        BinaryTreeNode rn = Insert(root.right);
        BinaryTreeNode lnr = new BinaryTreeNode(root.data);
        lnr.left = ln;
        lnr.right = null;
        root.left = lnr;
        root.right = rn;
    
    
        
        
        return root;
    }
	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		//Your code goes here
        BinaryTreeNode<Integer> temp = Insert(root);
	}
}