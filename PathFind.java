import java.util.ArrayList;

public class Solution {

    static ArrayList<Integer>path;
    public static boolean hasPath(BinaryTreeNode<Integer> root, int data){
        
        if(root == null){
            return false;
        }
        
        if(root.data == data){
            path.add(root.data);
            return true;
        }
        boolean lp = hasPath(root.left,data);
        if(lp){
            path.add(root.data);
            return true; 
        }
         boolean rp = hasPath(root.right,data);
        if(rp){
            path.add(root.data);
            return true; 
        }
        return false;
    }
	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		
       path = new ArrayList<Integer>(); 
       hasPath(root,data);
        return path;
        
        
        
        
	}
}