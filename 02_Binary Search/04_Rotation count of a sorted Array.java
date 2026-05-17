import java.util.Scanner;
// Do NOT change the class name
class Main {
    static int rotationCount(int array[], int size) {
        int minIndex = 0;
        for (int i = 1; i < size; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        if (minIndex == 0)
            return -1;
        return minIndex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            System.out.println(rotationCount(array, n));
        }
        sc.close();
    }
}