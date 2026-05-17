import java.util.*;
class Solve
{
    // The first argument is the number of bits.
    // Save all binary strings in strs.
    void generateAllStrings(int n, int i, char currStr[], ArrayList<String> strs)
    {
        // Base case
        if (i == n)
        {
            strs.add(new String(currStr));
            return;
        }
        // Put 0 at current position
        currStr[i] = '0';
        generateAllStrings(n, i + 1, currStr, strs);
        // Put 1 at current position
        currStr[i] = '1';
        generateAllStrings(n, i + 1, currStr, strs);
    }
}