class Result
{
  static int minReversal(String expr){
    int len = expr.length();
    // Odd length cannot be balanced
    if(len % 2 != 0)
      return -1;
    java.util.Stack<Character> st = new java.util.Stack<>();
    for(int i = 0; i < len; i++)
    {
      char ch = expr.charAt(i);
      if(ch == '[')
      {
        st.push(ch);
      }
      else
      {
        if(!st.isEmpty() && st.peek() == '[')
          st.pop();
        else
          st.push(ch);
      }
    }
    int open = 0, close = 0;
    while(!st.isEmpty())
    {
      if(st.pop() == '[')
        open++;
      else
        close++;
    }
    return (open + 1)/2 + (close + 1)/2;
  }
}