public class Solution {
    public static void Sum(BinaryTreeNode<Integer> root, int k,String psf){
        if(root == null){
            return;
        }
      
      
         if(root.data == k){
             psf = psf + root.data;
            System.out.println(psf);
            
        }
     Sum(root.left , k - root.data , psf + root.data + " ");
     Sum(root.right, k -root.data , psf + root.data + " ");
    }
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		//Your code goes 
        String psf = "";
        Sum(root,k,psf);
       
       
            
	}

}