class Result {
    public static int solveMaze(int maze[][], int size) {
        return countWays(maze, 0, 0, size);
    }
    static int countWays(int maze[][], int row, int col, int size) {
        // Out of bounds
        if (row >= size || col >= size) {
            return 0;
        }
        // Dead end cell
        if (maze[row][col] == -1) {
            return 0;
        }
        // Destination reached
        if (row == size - 1 && col == size - 1) {
            return 1;
        }
        // Move Down + Move Right
        return countWays(maze, row + 1, col, size)
             + countWays(maze, row, col + 1, size);
    }
}