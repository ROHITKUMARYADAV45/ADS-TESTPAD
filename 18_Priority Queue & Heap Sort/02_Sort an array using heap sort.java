class Result {
    // Heapify subtree rooted at index i
    static void heapify(int array[], int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        // Check left child
        if(left < n && array[left] > array[largest]) {
            largest = left;
        }
        // Check right child
        if(right < n && array[right] > array[largest]) {
            largest = right;
        }
        // Swap and heapify again
        if(largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapify(array, n, largest);
        }
    }
    static void heapSort(int array[], int n) {
        // Build max heap
        for(int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }
        // Extract elements one by one
        for(int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            // Heapify reduced heap
            heapify(array, i, 0);
        }
    }
}