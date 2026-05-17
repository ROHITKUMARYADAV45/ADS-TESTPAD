class Result{
  static int number_of_edges(int n){
    // Write your code here
      int[] dist = new int[n+1] ;
      boolean[] vis = new boolean[n+1] ;
      Queue<Integer> q = new LinkedList<>() ;
      q.add(1) ;
      vis[1] = true ;
      dist[1] = 0 ;
      while(!q.isEmpty()) {
          int curr = q.poll() ;
          int next1 = curr + 1 ;
          int next2 = curr*3 ;
          if(next1<=n && !vis[next1]) {
              vis[next1] = true ;
              dist[next1] = dist[curr] + 1 ;
              q.add(next1) ;
          }
          if(next2<=n && !vis[next2]) {
              vis[next2] = true ;
              dist[next2] = dist[curr] + 1 ;
              q.add(next2) ;
          }
          if(vis[n]) break ;
      }
      return dist[n];
  }
}