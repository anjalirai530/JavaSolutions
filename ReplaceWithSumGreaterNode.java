public class Solution {

	
   static int sum = 0;
   
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
       if(root == null){
            return;
        } 
        
        replaceWithLargerNodesSum(root.right);
         
        
         sum = sum + root.data;
         root.data = sum;
        
        replaceWithLargerNodesSum(root.left);
        
	}
}N