static int totalPaths = 0;
static void solve(Node root, ArrayList<Integer> path)
{
  if(root == null)
    return;
  path.add(root.data);
  // Leaf node
  if(root.left == null && root.right == null)
  {
    totalPaths++;
    for(int i = 0; i < path.size(); i++)
    {
      System.out.print(path.get(i) + " ");
    }
    // Length = number of edges
    System.out.println(path.size() - 1);
    path.remove(path.size() - 1);
    return;
  }
  solve(root.left, path);
  solve(root.right, path);
  path.remove(path.size() - 1);
}
static void printAllPaths(Node root) {
  if(root == null)
    return;
  totalPaths = 0;
  ArrayList<Integer> path = new ArrayList<>();
  solve(root, path);
  System.out.println(totalPaths);
}