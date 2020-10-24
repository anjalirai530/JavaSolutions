public class Solution {

    
    public static void change(BinaryTreeNode<Integer> root,int depth)
    {
        if(root == null){
            return;
        }
        root.data = depth;
        change(root.left,depth+1);
        change(root.right,depth+1);
         
    }
	
	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
	    //Your code goes here
        int depth = 0;
        change(root,depth);
        //preOrder(root);
       
	}

}