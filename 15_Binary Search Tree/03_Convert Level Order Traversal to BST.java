class Result {
  // Function to insert node in BST
  static Node insert(Node root, int key)
  {
    if(root == null)
      return new Node(key);
    if(key < root.data)
      root.leftChild = insert(root.leftChild, key);
    else
      root.rightChild = insert(root.rightChild, key);
    return root;
  }
  static Node buildSearchTree(int t[], int n) {
    Node root = null;
    for(int i = 0; i < n; i++)
    {
      root = insert(root, t[i]);
    }
    return root;
  }
}