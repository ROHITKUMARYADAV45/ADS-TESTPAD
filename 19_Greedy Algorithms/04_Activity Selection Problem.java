import java.util.*;
class Result {
    static class Activity {
        int start, finish;
        Activity(int s, int f) {
            start = s;
            finish = f;
        }
    }
    // Print starting times of selected activities
    static void activitySelection(int[] start, int[] finish) {
        int n = start.length;
        Activity arr[] = new Activity[n];
        for(int i = 0; i < n; i++) {
            arr[i] = new Activity(start[i], finish[i]);
        }
        // Sort by finish time
        Arrays.sort(arr, (a, b) -> a.finish - b.finish);
        ArrayList<Integer> result = new ArrayList<>();
        // Select first activity
        result.add(arr[0].start);
        int lastFinish = arr[0].finish;
        for(int i = 1; i < n; i++) {
            // Non-overlapping activity
            if(arr[i].start >= lastFinish) {
                result.add(arr[i].start);
                lastFinish = arr[i].finish;
            }
        }
        // Print result
        for(int x : result) {
            System.out.print(x + " ");
        }
    }
}