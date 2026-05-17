// Do not change the class name
class Result {
    /*
     * Complete the below function.
     * return the count of word in the 2-D board
     */
    static int countWord(char board[][], String word, int m, int n) {
        int count = 0;
        boolean visited[][] = new boolean[m][n];
        // Try starting from every cell
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                count += search(board, word, i, j, 0, visited, m, n);
            }
        }
        return count;
    }
    static int search(char board[][], String word,
                      int row, int col, int index,
                      boolean visited[][], int m, int n) {
        // Invalid conditions
        if (row < 0 || col < 0 || row >= m || col >= n
                || visited[row][col]
                || board[row][col] != word.charAt(index)) {
            return 0;
        }
        // Last character matched
        if (index == word.length() - 1) {
            return 1;
        }
        // Mark current cell visited
        visited[row][col] = true;
        int count = 0;
        // Explore all 4 directions
        count += search(board, word, row + 1, col, index + 1, visited, m, n);
        count += search(board, word, row - 1, col, index + 1, visited, m, n);
        count += search(board, word, row, col + 1, index + 1, visited, m, n);
        count += search(board, word, row, col - 1, index + 1, visited, m, n);
        // Backtrack
        visited[row][col] = false;
        return count;
    }
}