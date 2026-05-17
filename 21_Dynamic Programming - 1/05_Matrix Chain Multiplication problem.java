class Result
{
    // Matrix A[i] has dimension p[i-1] x p[i]
    static int matrixChainMultiplication(int p[], int n)
    {
        int dp[][] = new int[n + 1][n + 1];
        // len = chain length
        for(int len = 2; len <= n; len++)
        {
            for(int i = 1; i <= n - len + 1; i++)
            {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for(int k = i; k < j; k++)
                {
                    int cost = dp[i][k]
                             + dp[k + 1][j]
                             + p[i - 1] * p[k] * p[j];
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }
        return dp[1][n];
    }
}