import java.util.HashSet;
class Result {
    static int LongestConsecutiveSubsequence(int a[], int n) {
        HashSet<Integer> set = new HashSet<>();
        // Store all elements in set
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }
        int longest = 0;
        // Find longest consecutive sequence
        for (int i = 0; i < n; i++) {
            // Start only if previous number does not exist
            if (!set.contains(a[i] - 1)) {
                int current = a[i];
                int count = 1;
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}