public class Solution {
	/*
	 * BinaryTreeNode class
	 * 
	 * class BinaryTreeNode<T> 
	 * { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 *		public BinaryTreeNode(T data) 
	 *		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	public static boolean find(BinaryTreeNode<Integer>node, int data){
      if(node == null){
          return false;
      }else if(node.data > data){
          return find(node.left,data);
      }else if(node.data < data){
          return find(node.right,data);
      }else{
          return true;
      }
      
  }  
    public static void printNodes(BinaryTreeNode<Integer> node,BinaryTreeNode<Integer> root, int s){
        if(root == null){
            return;
        }
        printNodes(node,root.left,s);
        int comp = s - root.data;
        
        if(comp > root.data){
            if(find(node,comp) == true){
                System.out.println(root.data +" " + comp);
            }
        }
        printNodes(node,root.right,s);
    }
	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
        
        printNodes(root,root,s);
	}

}