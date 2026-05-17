class Result {
    static int maxFrequency(int A[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        int maxFreq = 0;
        int ans = Integer.MAX_VALUE;
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (freq > maxFreq) {
                maxFreq = freq;
                ans = key;
            }
            else if (freq == maxFreq && key < ans) {
                ans = key;
            }
        }
        return ans;
    }
}