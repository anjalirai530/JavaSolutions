public class Solution {

    public static BinaryTreeNode<Integer> createTree(int[] post,int []in,int siPost,int eiPost,int siIn,int eiIn){
        if(siPost > eiPost){
            return null;
        }
        int temp = post[eiPost];
        BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>(temp);
        
        int idx = -1;
        for(int i = siIn; i <= eiIn; i++){
            if(in[i] == temp){
                idx = i;
                break;
            }
        }
        int siPostLeft = siPost;
      
        int eiPostRight = eiPost - 1;
        int siInLeft = siIn;
        int eiInLeft = idx - 1;
        int siInRight = idx + 1;
        int eiInRight = eiIn;
        
        int len = eiInLeft - siInLeft + 1;
        int eiPostLeft = siPostLeft + len - 1;
        int siPostRight = eiPostLeft + 1;
        
        BinaryTreeNode<Integer> left = createTree(post,in,siPostLeft,eiPostLeft,siInLeft,eiInLeft);
        BinaryTreeNode<Integer> right = createTree(post,in,siPostRight,eiPostRight,siInRight,eiInRight);
        
        node.left = left;
        node.right = right;
        return node;
    }
	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		//Your code goes here
        BinaryTreeNode<Integer>root = createTree(postOrder,inOrder,0,postOrder.length-1,0,inOrder.length-1);
        return root;
	}
    

}