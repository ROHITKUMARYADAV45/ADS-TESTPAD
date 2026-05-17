int kthLargest(int arr[], int size, int k) {
    int i, j, temp;
    // Sort array in descending order
    for(i = 0; i < size - 1; i++) {
        for(j = i + 1; j < size; j++) {
            if(arr[i] < arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    return arr[k];
}