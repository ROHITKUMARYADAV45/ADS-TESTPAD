import java.util.HashMap;
class Result {
    static void findTheSubArray(int arr[], int n, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            // Subarray from 0 to i
            if (prefixSum == sum) {
                System.out.println(0 + " " + i);
                return;
            }
            // Check if required sum exists
            if (map.containsKey(prefixSum - sum)) {
                int start = map.get(prefixSum - sum) + 1;
                System.out.println(start + " " + i);
                return;
            }
            // Store first occurrence only
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }
        System.out.println(-1);
    }
}