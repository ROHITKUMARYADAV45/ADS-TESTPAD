class Result {
  static void printCousins(Node root, int k) {
    if(root == null || root.data == k)
    {
      System.out.print("-1");
      return;
    }
    java.util.Queue<Node> q = new java.util.LinkedList<>();
    q.add(root);
    boolean found = false;
    while(!q.isEmpty())
    {
      int size = q.size();
      for(int i = 0; i < size; i++)
      {
        Node curr = q.poll();
        boolean isParent = false;
        if(curr.leftChild != null && curr.leftChild.data == k)
          isParent = true;
        if(curr.rightChild != null && curr.rightChild.data == k)
          isParent = true;
        if(isParent)
        {
          found = true;
        }
        else
        {
          if(curr.leftChild != null)
            q.add(curr.leftChild);
          if(curr.rightChild != null)
            q.add(curr.rightChild);
        }
      }
      if(found)
      {
        if(q.isEmpty())
        {
          System.out.print("-1");
        }
        else
        {
          while(!q.isEmpty())
          {
            System.out.print(q.poll().data + " ");
          }
        }
        return;
      }
    }
    System.out.print("-1");
  }
}