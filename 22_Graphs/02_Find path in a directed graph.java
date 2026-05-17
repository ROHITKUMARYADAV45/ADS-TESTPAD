import java.util.*;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
        // Write your code here
        Scanner sc = new Scanner(System.in) ;
        int V = sc.nextInt() ; //vertices
        int E = sc.nextInt() ; // Edges
        boolean[] vis = new boolean[V];
        List<List<Integer>> adj = new ArrayList<>() ;
        for(int i=0 ; i<V ; i++) {
            adj.add(new ArrayList<>());
        }
        for(int i=0 ; i<E ; i++) {
            int u = sc.nextInt() ;
            int v = sc.nextInt();
            adj.get(u).add(v);
        }
        int src = sc.nextInt();
        int dest = sc.nextInt() ;
        if(dfs(src , dest , vis , adj)) System.out.print("YES") ;
        else System.out.print("NO") ;
    }
    static boolean dfs(int src , int dest , boolean[] vis , List<List<Integer>> adj) {
        if(src == dest) return true ;
        vis[src] = true ;
        for(int it : adj.get(src)){
            if(!vis[it] && dfs(it , dest , vis ,adj)) return true ;
        }
        return false ;
    }
}