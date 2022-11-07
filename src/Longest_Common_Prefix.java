//14
import java.util.Arrays;
import java.util.HashSet;

public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {

        String ans = "";
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int index = 0;
        boolean isFind = false;
        while ( index < first.length() && !isFind) {

            if (first.charAt(index) == last.charAt(index)) {
                index++;
            } else {
                isFind = true;

            }
        }
        ans = first.substring(0, index);
        return ans;
    }
}
