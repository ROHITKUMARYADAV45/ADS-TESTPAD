class Result {
  static long solveQuery(int N, int W, int i, char ch) {
    // Row query
    if(ch == 'R')
    {
      int start = (i - 1) * W + 1;
      // Row does not exist
      if(start > N)
        return 0;
      int end = Math.min(i * W, N);
      long count = end - start + 1;
      return (count * (start + end)) / 2;
    }
    // Column query
    else
    {
      // Column does not exist
      if(i > W || i > N)
        return 0;
      long sum = 0;
      for(int num = i; num <= N; num += W)
      {
        sum += num;
      }
      return sum;
    }
  }
}