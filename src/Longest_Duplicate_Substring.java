/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/12
 */
public class Longest_Duplicate_Substring {
    public static void main(String[] args) {
        String banana = longestDupSubstring("banana");
        System.out.println(banana);
    }

    public static String longestDupSubstring(String s) {
        int[] map = new int[128];
        int start = 0, end = 0, counter = 0;
        int maxLen = 0;
        String res = "";
        while (end < s.length()) {
            char ch1 = s.charAt(end);
            if (map[ch1] >= 1) {
                counter++;
            }
            map[ch1]++;
            end++;

            // met condtion
            while (counter > 0) {


                char ch2 = s.charAt(start);
                if (map[ch2] > 1) {
                    counter--;
                    if (end - start + 1 > maxLen) {
                        maxLen = end - start + 1;
                        res = s.substring(start, end);
                    }
                }
                map[ch2]--;
                start++;
            }
        }
        return res;
    }
}
