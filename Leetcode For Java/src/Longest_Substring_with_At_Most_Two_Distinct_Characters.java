/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/21
 */
public class Longest_Substring_with_At_Most_Two_Distinct_Characters {

    public static void main(String[] args) {
        int eceba = lengthOfLongestSubstringTwoDistinct("eceba");
        System.out.println(eceba);
    }
    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        int[] map = new int[128];
        int start = 0, end = 0, counter = 0, max = 0;
        while(end < s.length()) {
            char ch1 = s.charAt(end);
            if(map[ch1] >= 1) {
                counter++;
            }
            map[ch1]++;
            end++;
            while(counter > 0) {
                char ch2 = s.charAt(start);
                if(map[ch2] >= 2) {
                    counter--;
                }
                map[ch2]--;
                start++;
            }
            max = Math.max(max, end - start);
        }
        return max;
    }
}
