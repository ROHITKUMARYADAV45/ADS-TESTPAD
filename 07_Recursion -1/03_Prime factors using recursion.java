import java.util.Scanner;
// Do NOT change the class name
class Main {
    // Recursive function to print prime factors
    static void primeFactors(int n, int i) {
        // Base case
        if (n == 1) {
            return;
        }
        // If i divides n
        if (n % i == 0) {
            System.out.println(i);
            primeFactors(n / i, i);
        } 
        else {
            // Check next number
            primeFactors(n, i + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeFactors(n, 2);
    }
}