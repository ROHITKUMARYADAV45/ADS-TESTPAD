class Result {
    static void printStrangeElements(int[] arr, int n) {
        int xor = 0;
        // XOR of all elements
        for(int i = 0; i < n; i++) {
            xor ^= arr[i];
        }
        // Rightmost set bit
        int setBit = xor & (-xor);
        int x = 0, y = 0;
        // Divide into 2 groups
        for(int i = 0; i < n; i++) {
            if((arr[i] & setBit) != 0)
                x ^= arr[i];
            else
                y ^= arr[i];
        }
        // Print in ascending order
        if(x < y)
            System.out.println(x + " " + y);
        else
            System.out.println(y + " " + x);
    }
}