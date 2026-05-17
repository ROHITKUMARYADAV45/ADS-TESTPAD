/* The class is defined with below variables
class Graph { 
  private int V;
  private Map<Integer, List<Integer>> adjVertices;
  public Graph(int V) {
      this.V = V;
    this.adjVertices = new HashMap<Integer, List<Integer>>();
  }
  public void addVertex(int vertex) {
    adjVertices.putIfAbsent(vertex, new ArrayList<>());
  }
  public void addEdge(int src, int dest) {
    adjVertices.get(src).add(dest);
  }        */
void BFS(int v) 
{ 
    boolean[] vis = new boolean[V] ;
    Queue<Integer> q = new LinkedList<>() ;
    q.add(v) ;
    vis[v] = true ;
    while(!q.isEmpty()) {
        int node = q.poll() ;
        System.out.print(node + " ") ;
        for(int it : adjVertices.get(node)) {
            if(vis[it] == false) {
                vis[it] = true ;
                q.add(it) ;
            }
        }
    }
}