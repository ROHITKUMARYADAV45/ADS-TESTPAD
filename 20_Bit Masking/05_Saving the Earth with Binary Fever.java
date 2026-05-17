class Result {
    // Return the minimum number of jumps
    static int getMinJumps(long n) {
        int count = 0;
        while(n > 0) {
            // Remove lowest set bit
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}