import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static int count(int[] arr) {
        int swaps = 0 ;
        int n = arr.length ;
        for(int i=0 ; i<n-1 ; i++) {
            for(int j=0 ; j<n-i-1 ; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1] ;
                    arr[j+1] = arr[j] ;
                    arr[j] = temp ;
                    swaps++ ;
                }
            }
        }
        return swaps ;
    }
    public static void main(String[] args)
    {
        // Write your code here
        Scanner sc = new Scanner(System.in) ;
        int t = sc.nextInt() ;
        while(t-->0){
        int n = sc.nextInt() ;
        int[] arr = new int[n] ;
        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt() ;
        }
             System.out.println(count(arr)) ;
        }
// sc.close();
    }
}