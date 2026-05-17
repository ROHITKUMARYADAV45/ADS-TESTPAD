import java.util.*;
class Result {
    static class Node {
        int r, c, dist;
        Node(int r, int c, int dist) {
            this.r = r;
            this.c = c;
            this.dist = dist;
        }
    }
    static int shortestPath(int mat[][], int srcR, int srcC,
                            int destR, int destC, int m, int n) {
        // Source or destination blocked
        if(mat[srcR][srcC] == 0 || mat[destR][destC] == 0)
            return -1;
        // Directions: up, down, left, right
        int dr[] = {-1, 1, 0, 0};
        int dc[] = {0, 0, -1, 1};
        boolean visited[][] = new boolean[m][n];
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(srcR, srcC, 0));
        visited[srcR][srcC] = true;
        while(!q.isEmpty()) {
            Node curr = q.poll();
            // Destination reached
            if(curr.r == destR && curr.c == destC)
                return curr.dist;
            for(int i = 0; i < 4; i++) {
                int nr = curr.r + dr[i];
                int nc = curr.c + dc[i];
                // Valid move
                if(nr >= 0 && nr < m &&
                   nc >= 0 && nc < n &&
                   mat[nr][nc] == 1 &&
                   !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    q.add(new Node(nr, nc, curr.dist + 1));
                }
            }
        }
        return -1;
    }
}