public static Node removeLeaves(Node node){
    if(node == null){
        return null;
    }
    if(node.left == null && node.right == null){
        return null;
    }
   Node ln = removeLeaves(node.left);
   Node rn = removeLeaves(node.right);
   node.left = ln;
   node.right = rn;
   return node;
    
    
}