public static int countLeaf(Node node){
    int count = 0;
    if(node == null){
        return 0;
    }
    if(node.left == null && node.right == null){
        count++;
    }
  int lc =  countLeaf(node.left);
  int rc =   countLeaf(node.right);
  return lc + rc + count;
}