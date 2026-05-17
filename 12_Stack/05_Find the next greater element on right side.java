class Result{
  static void printNextGreaterElement(int arr[], int n){
    java.util.Stack<Integer> st = new java.util.Stack<>();
    int ans[] = new int[n];
    // Traverse from right
    for(int i = n - 1; i >= 0; i--)
    {
      // Remove smaller elements
      while(!st.isEmpty() && st.peek() < arr[i])
      {
        st.pop();
      }
      // Next greater element
      if(st.isEmpty())
        ans[i] = -1;
      else
        ans[i] = st.peek();
      // Push current element
      st.push(arr[i]);
    }
    // Print answer
    for(int i = 0; i < n; i++)
    {
      System.out.print(ans[i] + " ");
    }
  }
}