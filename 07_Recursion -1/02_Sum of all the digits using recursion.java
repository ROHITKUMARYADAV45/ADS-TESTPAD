import java.util.Scanner;
// Do NOT change the class name
class Main {
    // Recursive function
    static int sumOfDigits(int n) {
        // Handle negative number
        if (n < 0) {
            return -sumOfDigits(-n);
        }
        // Base case
        if (n == 0) {
            return 0;
        }
        // Recursive case
        return (n % 10) + sumOfDigits(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(sumOfDigits(n));
        }
    }
}