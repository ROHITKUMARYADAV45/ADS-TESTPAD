class Result {
  static int postIndex;
  static Node build(int in[], int post[], int start, int end)
  {
    if(start > end)
      return null;
    // Last element of postorder is root
    Node root = new Node(post[postIndex--]);
    // Find root in inorder
    int inIndex = start;
    for(int i = start; i <= end; i++)
    {
      if(in[i] == root.data)
      {
        inIndex = i;
        break;
      }
    }
    // Build right subtree first
    root.rightChild = build(in, post, inIndex + 1, end);
    // Build left subtree
    root.leftChild = build(in, post, start, inIndex - 1);
    return root;
  }
  static Node buildTree(int in[], int post[], int N) {
    postIndex = N - 1;
    return build(in, post, 0, N - 1);
  }
}