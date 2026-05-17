static Node buildTree(int arr[], int n) {
  if(n == 0)
    return null;
  Node[] nodes = new Node[n];
  // Create all nodes
  for(int i = 0; i < n; i++)
  {
    nodes[i] = new Node(arr[i]);
  }
  // Connect children
  for(int i = 0; i < n; i++)
  {
    int leftIndex = 2 * i + 1;
    int rightIndex = 2 * i + 2;
    if(leftIndex < n)
      nodes[i].left = nodes[leftIndex];
    if(rightIndex < n)
      nodes[i].right = nodes[rightIndex];
  }
  return nodes[0];
}