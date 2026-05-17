static String reverseString(CQStack s, String st)
{
  // Reset stack
  s.top = -1;
  // Push all characters into stack
  for(int i = 0; i < st.length(); i++)
  {
    s.push(st.charAt(i));
  }
  String rev = "";
  // Pop characters from stack
  while(!s.isEmpty())
  {
    rev += (char)s.pop();
  }
  return rev;
}