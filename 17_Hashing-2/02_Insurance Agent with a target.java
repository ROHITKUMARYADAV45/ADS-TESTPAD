import java.util.HashMap;
class Result {
    static int totalWays(int members[], int n, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Prefix sum 0 occurs once
        map.put(0, 1);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            sum += members[i];
            // Check if (sum - target) exists
            if (map.containsKey(sum - target)) {
                count += map.get(sum - target);
            }
            // Store current prefix sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}