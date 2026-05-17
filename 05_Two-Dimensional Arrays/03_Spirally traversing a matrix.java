class Result {
    static void printSpiral(int a[][], int r, int c) {
        int top = 0;
        int bottom = r - 1;
        int left = 0;
        int right = c - 1;
        while (top <= bottom && left <= right) {
            // Left to Right
            for (int i = left; i <= right; i++) {
                System.out.println(a[top][i]);
            }
            top++;
            // Top to Bottom
            for (int i = top; i <= bottom; i++) {
                System.out.println(a[i][right]);
            }
            right--;
            // Right to Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.println(a[bottom][i]);
                }
                bottom--;
            }
            // Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.println(a[i][left]);
                }
                left++;
            }
        }
    }
}