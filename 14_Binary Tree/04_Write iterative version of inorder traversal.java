static void printInorder(Node root)
{
  Stack<Node> st = new Stack<>();
  Node curr = root;
  while(curr != null || !st.isEmpty())
  {
    // Go to leftmost node
    while(curr != null)
    {
      st.push(curr);
      curr = curr.leftChild;
    }
    // Process node
    curr = st.pop();
    System.out.print(curr.data + " ");
    // Move to right subtree
    curr = curr.rightChild;
  }
}