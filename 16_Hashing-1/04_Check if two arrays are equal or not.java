import java.util.HashMap;
class Result {
    static int arraysEqualorNot(int[] A, int[] B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Count frequency of elements in A
        for (int i = 0; i < A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        // Reduce frequency using B
        for (int i = 0; i < B.length; i++) {
            if (!map.containsKey(B[i])) {
                return 0;
            }
            map.put(B[i], map.get(B[i]) - 1);
            if (map.get(B[i]) == 0) {
                map.remove(B[i]);
            }
        }
        return map.isEmpty() ? 1 : 0;
    }
}