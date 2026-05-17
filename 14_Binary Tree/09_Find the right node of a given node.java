class Result {
  static int findRightSibling(Node root, int key) {
    if(root == null)
      return -1;
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    while(!q.isEmpty())
    {
      int size = q.size();
      for(int i = 0; i < size; i++)
      {
        Node curr = q.poll();
        // Found the key
        if(curr.data == key)
        {
          // If not last node in level
          if(i < size - 1)
            return q.peek().data;
          else
            return -1;
        }
        if(curr.left != null)
          q.add(curr.left);
        if(curr.right != null)
          q.add(curr.right);
      }
    }
    return -1;
  }
}