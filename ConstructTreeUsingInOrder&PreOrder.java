/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

public class Solution {

   
    public static BinaryTreeNode<Integer> buildTreeHelper(int pre[],int in[],int siPre,int eiPre,int siIn,int eiIn){
      if(siPre > eiPre){
          return null;
      }  
        int rootData = pre[siPre];
      BinaryTreeNode<Integer> root = new BinaryTreeNode(rootData);
        int rootIndex = -1;
        for(int i = siIn; i <= eiIn; i++){
            if(in[i] == rootData){
                rootIndex = i;
                break;
            }
        }
        int siPreLeft = siPre + 1;
        int siInleft = siIn;
        int eiInLeft = rootIndex -1;
        int siInRight = rootIndex + 1;
        int eiPreRight = eiPre;
        int eiInRight = eiIn;
        
        int leftSubtreeLength = eiInLeft - siInleft +1;
        int eiPreLeft = siPreLeft+leftSubtreeLength-1;
        int siPreRight = eiPreLeft+1;
        
        
        BinaryTreeNode<Integer> left = buildTreeHelper(pre,in,siPreLeft,eiPreLeft,siInleft,eiInLeft);
        BinaryTreeNode<Integer> right = buildTreeHelper(pre,in,siPreRight,eiPreRight,siInRight,eiInRight);
        
        root.left = left;
        root.right = right;
        
        return root;
        
    }
	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		//Your code goes 
      BinaryTreeNode<Integer>root =  buildTreeHelper(preOrder,inOrder,0,preOrder.length - 1,0,inOrder.length-1);
	  return root;
    }
    

}