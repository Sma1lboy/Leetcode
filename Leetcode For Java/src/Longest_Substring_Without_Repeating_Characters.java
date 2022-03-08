import java.util.HashMap;
import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(""));
    }

    public static int lengthOfLongestSubstring(String s) {
        int start = 0, end = 0, maxSize = 0;
        HashSet<Character> hs = new HashSet<>();
        while (end <s.length()) {
            if (!hs.contains(s.charAt(end))) {
                hs.add(s.charAt(end));
                end++;
                maxSize = Math.max(maxSize, hs.size());
            }
            else {
                hs.remove(s.charAt(start));
                start++;
            }
        }
        return maxSize;
    }

}
