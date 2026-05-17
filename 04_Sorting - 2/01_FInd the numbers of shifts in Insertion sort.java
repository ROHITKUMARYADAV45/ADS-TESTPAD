import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            long shifts = 0;
            for (int i = 1; i < n; i++) {
                int key = arr[i];
                int j = i - 1;
                int cnt = 0;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                    cnt++;
                }
                arr[j + 1] = key;
                if (cnt > 0) {
                    shifts += cnt + 1;
                }
            }
            System.out.println(shifts);
        }
    }
}