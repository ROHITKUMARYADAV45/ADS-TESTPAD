class Result {
  static void printOdd(Node root) {
    if(root == null)
      return;
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    int level = 1;
    while(!q.isEmpty())
    {
      int size = q.size();
      for(int i = 0; i < size; i++)
      {
        Node curr = q.poll();
        // Print only odd levels
        if(level % 2 != 0)
        {
          System.out.print(curr.data + " ");
        }
        if(curr.left != null)
          q.add(curr.left);
        if(curr.right != null)
          q.add(curr.right);
      }
      level++;
    }
  }
}