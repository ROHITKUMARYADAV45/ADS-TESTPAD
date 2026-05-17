class Result {
  static boolean isMirror(Node a, Node b)
  {
    // Both null
    if(a == null && b == null)
      return true;
    // One null, one not null
    if(a == null || b == null)
      return false;
    // Check mirror structure
    return isMirror(a.left, b.right) &&
           isMirror(a.right, b.left);
  }
  static int isFoldable(Node root) {
    // Empty tree or single node
    if(root == null)
      return 1;
    if(isMirror(root.left, root.right))
      return 1;
    return 0;
  }
}