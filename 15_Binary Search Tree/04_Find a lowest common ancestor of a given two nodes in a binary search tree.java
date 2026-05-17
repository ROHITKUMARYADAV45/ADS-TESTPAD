class Result {
  static int lowestCommonAncestor(Node root, int k1, int k2) {
    if(root == null)
      return -1;
    while(root != null)
    {
      // Both keys in left subtree
      if(k1 < root.data && k2 < root.data)
      {
        root = root.left;
      }
      // Both keys in right subtree
      else if(k1 > root.data && k2 > root.data)
      {
        root = root.right;
      }
      // Split point = LCA
      else
      {
        return root.data;
      }
    }
    return -1;
  }
}