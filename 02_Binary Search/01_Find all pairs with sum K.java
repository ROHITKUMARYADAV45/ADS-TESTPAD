class Result {
    static int getPairsCount(int arr[], int n, int k) {
        java.util.HashMap<Integer, Integer> map =
                new java.util.HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int complement = k - arr[i];
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return count;
    }
}