import java.util.*;
class Result {
    static class Job {
        int deadline, profit;
        Job(int d, int p) {
            deadline = d;
            profit = p;
        }
    }
    static int jobScheduling(int[] deadlines, int[] profits) {
        int n = deadlines.length;
        Job jobs[] = new Job[n];
        int maxDeadline = 0;
        for(int i = 0; i < n; i++) {
            jobs[i] = new Job(deadlines[i], profits[i]);
            maxDeadline = Math.max(maxDeadline, deadlines[i]);
        }
        // Sort by profit descending
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);
        boolean slot[] = new boolean[maxDeadline + 1];
        int totalProfit = 0;
        // Try to schedule each job
        for(int i = 0; i < n; i++) {
            // Find latest free slot
            for(int j = jobs[i].deadline; j >= 1; j--) {
                if(!slot[j]) {
                    slot[j] = true;
                    totalProfit += jobs[i].profit;
                    break;
                }
            }
        }
        return totalProfit;
    }
}