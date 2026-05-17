class Result {
  static String ones[] = {
    "", "one", "two", "three", "four", "five",
    "six", "seven", "eight", "nine", "ten",
    "eleven", "twelve", "thirteen", "fourteen",
    "fifteen", "sixteen", "seventeen", "eighteen",
    "nineteen"
  };
  static String tens[] = {
    "", "", "twenty", "thirty", "forty",
    "fifty", "sixty", "seventy", "eighty", "ninety"
  };
  static String convert(int n)
  {
    String res = "";
    if(n >= 100)
    {
      res += ones[n / 100] + " hundred ";
      n %= 100;
    }
    if(n >= 20)
    {
      res += tens[n / 10] + " ";
      n %= 10;
    }
    if(n > 0)
    {
      res += ones[n] + " ";
    }
    return res;
  }
  static void intToWord(int n) {
    if(n == 0)
    {
      System.out.print("zero");
      return;
    }
    String ans = "";
    // Lakhs
    if(n >= 100000)
    {
      ans += convert(n / 100000) + "lakhs ";
      n %= 100000;
    }
    // Thousands
    if(n >= 1000)
    {
      ans += convert(n / 1000) + "thousand ";
      n %= 1000;
    }
    // Remaining part
    ans += convert(n);
    System.out.print(ans.trim());
  }
}