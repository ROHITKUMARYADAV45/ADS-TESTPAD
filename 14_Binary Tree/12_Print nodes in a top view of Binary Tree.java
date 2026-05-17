class Result {
  static class Pair
  {
    Node node;
    int hd;
    Pair(Node n, int h)
    {
      node = n;
      hd = h;
    }
  }
  static void printTopView(Node root) {
    if(root == null)
      return;
    java.util.Queue<Pair> q = new java.util.LinkedList<>();
    java.util.TreeMap<Integer, Integer> map =
        new java.util.TreeMap<>();
    q.add(new Pair(root, 0));
    while(!q.isEmpty())
    {
      Pair curr = q.poll();
      // First node at this HD
      if(!map.containsKey(curr.hd))
      {
        map.put(curr.hd, curr.node.data);
      }
      if(curr.node.left != null)
      {
        q.add(new Pair(curr.node.left, curr.hd - 1));
      }
      if(curr.node.right != null)
      {
        q.add(new Pair(curr.node.right, curr.hd + 1));
      }
    }
    for(int val : map.values())
    {
      System.out.print(val + " ");
    }
  }
}