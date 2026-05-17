class Result {
  static int countIslands(int mat[][], int m, int n){
    // Write your code here
      if(mat == null || mat.length == 0) return 0 ;
      int count = 0 ;
      for(int i=0 ; i<m ; i++) {
          for(int j=0 ; j<n ; j++) {
              if(mat[i][j] == 1) {
                  dfs(mat , i , j) ;
                  count++ ;
              }
          }
      }
      return count ;
  }   
    private static void dfs(int mat[][] , int i , int j) {
        if(i<0 || j<0 || i>=mat.length || j>=mat[0].length || mat[i][j] == 0) return;
        mat[i][j] = 0 ;
        dfs(mat , i+1 , j) ;
        dfs(mat , i-1 , j) ;
        dfs(mat , i , j+1) ;
        dfs(mat , i , j-1) ;
    }
}