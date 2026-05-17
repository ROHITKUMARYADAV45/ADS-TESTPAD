static Node findMirror(Node root) {
  if(root == null)
    return null;
  // Swap left and right child
  Node temp = root.left;
  root.left = root.right;
  root.right = temp;
  // Recur for left and right subtree
  findMirror(root.left);
  findMirror(root.right);
  return root;
}