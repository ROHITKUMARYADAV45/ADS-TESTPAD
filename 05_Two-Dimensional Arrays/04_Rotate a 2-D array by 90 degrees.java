import java.util.Scanner;
// Do NOT change the class name
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int arr[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            // Rotate 90 degree clockwise
            for (int j = 0; j < N; j++) {
                for (int i = N - 1; i >= 0; i--) {
                    System.out.print(arr[i][j]);
                    if (i != 0)
                        System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }
}