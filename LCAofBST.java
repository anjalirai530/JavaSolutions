public class Solution {

	public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
        if(root == null){
            return  -1;
        }
	         if(root.data > a && root.data > b){
                 return getLCA(root.left,a,b);
             }	else if(root.data < a && root.data < b){
                 return getLCA(root.right,a,b);
             }  else{
                 return root.data;
             }
	}
}