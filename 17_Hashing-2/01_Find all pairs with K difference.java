import java.util.HashSet;
class Result {
    static int getPairsCount(int arr[], int n, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            // Check if pair exists
            if (set.contains(arr[i] + k)) {
                count++;
            }
        }
        return count;
    }
}