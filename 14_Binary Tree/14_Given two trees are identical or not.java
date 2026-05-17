class Result {
  static int areSameTree(Node t1, Node t2) {
    // Both trees empty
    if(t1 == null && t2 == null)
      return 1;
    // One tree empty
    if(t1 == null || t2 == null)
      return 0;
    // Data mismatch
    if(t1.data != t2.data)
      return 0;
    // Check left and right subtree
    if(areSameTree(t1.left, t2.left) == 1 &&
       areSameTree(t1.right, t2.right) == 1)
      return 1;
    return 0;
  }
}