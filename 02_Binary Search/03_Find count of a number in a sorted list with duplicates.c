#include <stdio.h>
int firstOccurrence(int arr[], int n, int k) {
    int low = 0, high = n - 1;
    int ans = -1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == k) {
            ans = mid;
            high = mid - 1;
        }
        else if (arr[mid] < k) {
            low = mid + 1;
        }
        else {
            high = mid - 1;
        }
    }
    return ans;
}
int lastOccurrence(int arr[], int n, int k) {
    int low = 0, high = n - 1;
    int ans = -1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == k) {
            ans = mid;
            low = mid + 1;
        }
        else if (arr[mid] < k) {
            low = mid + 1;
        }
        else {
            high = mid - 1;
        }
    }
    return ans;
}
int main()
{
    int T;
    scanf("%d", &T);
    while (T--) {
        int n, k;
        scanf("%d %d", &n, &k);
        int arr[n];
        for (int i = 0; i < n; i++) {
            scanf("%d", &arr[i]);
        }
        int first = firstOccurrence(arr, n, k);
        int last = lastOccurrence(arr, n, k);
        if (first == -1)
            printf("0\n");
        else
            printf("%d\n", last - first + 1);
    }
    return 0;
}