import java.util.*;
class Result 
{
    // Check if queen can be placed safely
    int isSafe(int board[][], int row, int col, int N) 
    { 
        int i, j;
        // Check left side of current row
        for (i = 0; i < col; i++)
        {
            if (board[row][i] == 1)
                return 0;
        }
        // Check upper left diagonal
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
        {
            if (board[i][j] == 1)
                return 0;
        }
        // Check lower left diagonal
        for (i = row, j = col; i < N && j >= 0; i++, j--)
        {
            if (board[i][j] == 1)
                return 0;
        }
        return 1;
    } 
    // Solve N Queen Problem
    boolean solveNQUtil(int board[][], int col, int N,
                        ArrayList<ArrayList<Integer>> sol)
    { 
        // Base case
        if (col == N)
        {
            ArrayList<Integer> ans = new ArrayList<>();
            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < N; j++)
                {
                    if (board[i][j] == 1)
                    {
                        ans.add(j);
                    }
                }
            }
            sol.add(ans);
            return true;
        }
        boolean res = false;
        // Try placing queen in all rows
        for (int i = 0; i < N; i++)
        {
            if (isSafe(board, i, col, N) == 1)
            {
                board[i][col] = 1;
                res = solveNQUtil(board, col + 1, N, sol) || res;
                // Backtrack
                board[i][col] = 0;
            }
        }
        return res;
    } 
}