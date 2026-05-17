class Result {
    static int searchRotatedSortedArray(int arr[], int k) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == k)
                return mid;
            // Left half sorted
            if (arr[low] <= arr[mid]) {
                if (k >= arr[low] && k < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Right half sorted
            else {
                if (k > arr[mid] && k <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}