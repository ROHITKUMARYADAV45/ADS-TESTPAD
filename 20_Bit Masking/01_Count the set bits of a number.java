class Result
{
    static int countBits(int num)
    {
        int count = 0;
        while(num > 0)
        {
            // Check last bit
            count += (num & 1);
            // Right shift
            num = num >> 1;
        }
        return count;
    }
}