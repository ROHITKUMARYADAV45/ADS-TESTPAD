class Result{
    static int toggleExceptKthBit(int n, int k){
        // Toggle all bits
        int result = ~n;
        // Original kth bit
        int kthBit = n & (1 << k);
        // Make kth bit same as original
        if(kthBit != 0)
            result |= (1 << k);
        else
            result &= ~(1 << k);
        return result;
    }
}