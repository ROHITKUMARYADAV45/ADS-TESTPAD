void DFSUtil(int v, boolean visited[], List<Integer> ls) {
    visited[v] = true;
    ls.add(v);
    for(int it : adjVertices.get(v)) {
        if(visited[it] == false) {
            DFSUtil(it , visited , ls);
        }
    }
}
void DFS(int v) {
    boolean[] visited = new boolean[adjVertices.size()];
    ArrayList<Integer> ls = new ArrayList<>();
    DFSUtil(v, visited, ls);
    for (int node : ls) {
        System.out.print(node + " ");
    }
}