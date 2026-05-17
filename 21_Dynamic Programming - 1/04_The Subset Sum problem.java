class Result
{
    static int subsetSum(int a[], int n, int sum)
    {
        boolean dp[][] = new boolean[n + 1][sum + 1];
        // Sum 0 is always possible
        for(int i = 0; i <= n; i++)
        {
            dp[i][0] = true;
        }
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= sum; j++)
            {
                // Exclude current element
                dp[i][j] = dp[i - 1][j];
                // Include current element
                if(j >= a[i - 1])
                {
                    dp[i][j] = dp[i][j] ||
                               dp[i - 1][j - a[i - 1]];
                }
            }
        }
        return dp[n][sum] ? 1 : 0;
    }
}