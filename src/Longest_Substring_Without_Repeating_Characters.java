import java.util.HashMap;
import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcbcbb"));
    }

//    public static int lengthOfLongestSubstring(String s) {
//        int start = 0, end = 0, maxSize = 0;
//        HashSet<Character> hs = new HashSet<>();
//        while (end <s.length()) {
//            if (!hs.contains(s.charAt(end))) {
//                hs.add(s.charAt(end));
//                end++;
//                maxSize = Math.max(maxSize, hs.size());
//            }
//            else {
//                hs.remove(s.charAt(start));
//                start++;
//            }
//        }
//        return maxSize;
//    }
public static int lengthOfLongestSubstring(String s) {
    //freq map
    int[] map = new int[128];
    int start = 0, end = 0, counter = 0;
    int maxLen = 0;
    while(end < s.length()) {
        char c1 = s.charAt(end);
        //if no character exist in curr position
        if(map[c1] > 0) {
            counter++;
        }
        map[c1]++;
        end++;
        //when the condition met
        while(counter > 0) {
            char c2 = s.charAt(start);
            if(map[c2] > 1) {
                counter--;
            }
            map[c2]--;
            start++;
        }
        maxLen = Math.max(maxLen, end - start);
    }
    return maxLen;
}

}
