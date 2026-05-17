class Result { 
    static int decimalToBinary(int n) { 
        // Base case
        if (n == 0) {
            return 0;
        }
        // Recursive case
        return decimalToBinary(n / 2) * 10 + (n % 2);
    } 
}