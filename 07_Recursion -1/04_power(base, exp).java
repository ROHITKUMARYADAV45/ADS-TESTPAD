class Result {
    static long power(int base, int exp) {
        // Negative exponent case
        if (exp < 0) {
            return -1;
        }
        // Base case
        if (exp == 0) {
            return 1;
        }
        // Recursive case using O(log n)
        long half = power(base, exp / 2);
        if (exp % 2 == 0) {
            return half * half;
        } else {
            return base * half * half;
        }
    }
}