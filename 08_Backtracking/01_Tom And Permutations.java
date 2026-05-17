import java.util.*;
class Solve {
    /*
     * Return all the permutations of the given string in any order,
     * as they will be sorted at the back-end before printing.
     */
    ArrayList<String> permute(String str) {
        ArrayList<String> result = new ArrayList<>();
        generate(str, "", result);
        return result;
    }
    void generate(String str, String ans, ArrayList<String> result) {
        // Base case
        if (str.length() == 0) {
            result.add(ans);
            return;
        }
        // Recursive case
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining =
                    str.substring(0, i) + str.substring(i + 1);
            generate(remaining, ans + ch, result);
        }
    }
}