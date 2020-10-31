 static boolean isBalance = true;
  public static int Gap(Node node){
      if(node == null){
          return 0;
      }
       int lh = Gap(node.left);
      int rh = Gap(node.right);
      int th = Math.max(lh,rh)+1;
      int gap = Math.abs(lh - rh);
      if(gap > 1){
          isBalance = false;
      }