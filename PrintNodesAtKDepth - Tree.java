public static void depth(Node node,int k){
    if(node == null){
        return;
    }
    if(k == 0){
        System.out.println(node.data + " ");
    }
   depth(node.left,k-1);
   depth(node.right,k-1);
}