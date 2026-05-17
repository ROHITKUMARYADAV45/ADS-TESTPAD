static int evalPostfix(CQStack s, String exp) {
  // Reset stack
  s.top = -1;
  for(int i = 0; i < exp.length(); i++)
  {
    char ch = exp.charAt(i);
    // Operand
    if(Character.isDigit(ch))
    {
      s.push(ch - '0');
    }
    else
    {
      int b = s.pop();
      int a = s.pop();
      switch(ch)
      {
        case '+':
          s.push(a + b);
          break;
        case '-':
          s.push(a - b);
          break;
        case '*':
          s.push(a * b);
          break;
        case '/':
          s.push(a / b);
          break;
        case '^':
          s.push((int)Math.pow(a, b));
          break;
      }
    }
  }
  return s.pop();
}