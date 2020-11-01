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



/*

	Representation of the Pair Class

	class Pair<T, U> {
		T minimum;
		U maximum;

		public Pair(T minimum, U maximum) {
			this.minimum = minimum;
			this.maximum = maximum;
		}

	}

*/

public class Solution {
    
     // Returns the min value in a binary tree
 public static int max(BinaryTreeNode<Integer> root) {
    // write your code here
    if(root == null){
        return Integer.MIN_VALUE;
    }
    int lm = max(root.left);
    int rm = max(root.right);
    int tm = Math.max(root.data,Math.max(lm,rm));
    return tm;
  }
    public static int min(BinaryTreeNode<Integer> root) {
    // write your code here
    if(root == null){
        return Integer.MAX_VALUE;
    }
    int lm = min(root.left);
    int rm = min(root.right);
    int tm = Math.min(root.data,Math.min(lm,rm));
    return tm;
  }
	public static Pair getMinAndMax(BinaryTreeNode<Integer> root) {
		//Your code goes here
     int max = max(root);
     int min =  min(root);
     Pair p = new Pair(min,max);
      return p;
         
    }
}