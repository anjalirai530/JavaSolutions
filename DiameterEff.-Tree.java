 public static DiaPair diameter(Node node){
      if(node == null){
          DiaPair p = new DiaPair();
          p.ht = -1;
          p.dia = 0;
          return p;
      }
      
      DiaPair ld = diameter(node.left);
      DiaPair rd = diameter(node.right);
      DiaPair dp = new DiaPair();
      dp.ht = Math.max(ld.ht,rd.ht) + 1;
      int max = ld.ht + rd.ht + 2;
      dp.dia = Math.max(max,Math.max(ld.dia,rd.dia));
      
      return dp;
  }