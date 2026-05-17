import java.util.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
class Result {
    static List<Integer> cutSticks(List<Integer> lengths) {
        List<Integer> result = new ArrayList<>();
        Collections.sort(lengths);
        int n = lengths.size();
        result.add(n);
        for (int i = 1; i < n; i++) {
            if (!lengths.get(i).equals(lengths.get(i - 1))) {
                result.add(n - i);
            }
        }
        return result;
    }
}