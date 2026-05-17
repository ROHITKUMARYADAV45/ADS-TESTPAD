import java.util.*;
class Result {
    static class Interval {
        int start, end;
        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }
    static int intervalScheduling(int[] start, int[] end) {
        int n = start.length;
        if(n == 0)
            return 0;
        Interval arr[] = new Interval[n];
        for(int i = 0; i < n; i++) {
            arr[i] = new Interval(start[i], end[i]);
        }
        // Sort by end time
        Arrays.sort(arr, (a, b) -> a.end - b.end);
        int count = 1;
        int lastEnd = arr[0].end;
        for(int i = 1; i < n; i++) {
            // Allow equal boundary
            if(arr[i].start >= lastEnd) {
                count++;
                lastEnd = arr[i].end;
            }
        }
        return count;
    }
}