int evenDigits(int n)
{
    // Base case
    if(n == 0)
        return 0;
    int small = evenDigits(n / 10);
    int digit = n % 10;
    // If digit is even
    if(digit % 2 == 0)
    {
        return small * 10 + digit;
    }
    return small;
}