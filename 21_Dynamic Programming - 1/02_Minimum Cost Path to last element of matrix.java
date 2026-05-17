class Result
{
    static int minCostPath(int cost[][], int m, int n)
    {
        int dp[][] = new int[m][n];
        // Starting point
        dp[0][0] = cost[0][0];
        // First column
        for(int i = 1; i < m; i++)
        {
            dp[i][0] = dp[i - 1][0] + cost[i][0];
        }
        // First row
        for(int j = 1; j < n; j++)
        {
            dp[0][j] = dp[0][j - 1] + cost[0][j];
        }
        // Fill remaining cells
        for(int i = 1; i < m; i++)
        {
            for(int j = 1; j < n; j++)
            {
                dp[i][j] = cost[i][j] +
                           Math.min(dp[i - 1][j],
                           Math.min(dp[i][j - 1],
                                    dp[i - 1][j - 1]));
            }
        }
        // Minimum cost to reach last cell
        return dp[m - 1][n - 1];
    }
}