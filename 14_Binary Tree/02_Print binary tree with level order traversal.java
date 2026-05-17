static void printLevelWise(Node root) {
  if(root == null)
    return;
  Queue<Node> q = new LinkedList<>();
  q.add(root);
  while(!q.isEmpty())
  {
    int size = q.size();
    for(int i = 0; i < size; i++)
    {
      Node curr = q.poll();
      // Last node of level
      if(i == size - 1)
        System.out.print(curr.data);
      else
        System.out.print(curr.data + " ");
      if(curr.left != null)
        q.add(curr.left);
      if(curr.right != null)
        q.add(curr.right);
    }
    System.out.println();
  }
}