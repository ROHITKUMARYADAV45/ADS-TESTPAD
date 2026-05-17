import java.util.Scanner;
// Do NOT change the class name
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int asize = sc.nextInt();
        int[] a = new int[asize];
        for (int i = 0; i < asize; i++) {
            a[i] = sc.nextInt();
        }
        int bsize = sc.nextInt();
        int[] b = new int[bsize];
        for (int i = 0; i < bsize; i++) {
            b[i] = sc.nextInt();
        }
        int[] result = new int[asize + bsize];
        int i = 0, j = 0, k = 0;
        while (i < asize && j < bsize) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }
        while (i < asize) {
            result[k++] = a[i++];
        }
        while (j < bsize) {
            result[k++] = b[j++];
        }
        for (int x = 0; x < result.length; x++) {
            System.out.println(result[x]);
        }
        sc.close();
    }
}