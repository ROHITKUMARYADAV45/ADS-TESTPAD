import java.util.*;
// Do NOT change the class name
class Main {
    static boolean dfs(int node, int parent,
                       ArrayList<ArrayList<Integer>> adj,
                       boolean visited[]) {
        visited[node] = true;
        for(int neighbor : adj.get(node)) {
            // If not visited
            if(!visited[neighbor]) {
                if(dfs(neighbor, node, adj, visited))
                    return true;
            }
            // Visited and not parent => cycle
            else if(neighbor != parent) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        // Input edges
        for(int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u); // Undirected graph
        }
        boolean visited[] = new boolean[V];
        boolean hasCycle = false;
        // Graph disconnected ho sakta hai
        for(int i = 0; i < V; i++) {
            if(!visited[i]) {
                if(dfs(i, -1, adj, visited)) {
                    hasCycle = true;
                    break;
                }
            }
        }
        if(hasCycle)
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    }
}