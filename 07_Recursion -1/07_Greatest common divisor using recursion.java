class Result
{
    static int gcd(int i, int j)
    {
        // Base case
        if (j == 0)
        {
            return i;
        }
        // Recursive case
        return gcd(j, i % j);
    }
}