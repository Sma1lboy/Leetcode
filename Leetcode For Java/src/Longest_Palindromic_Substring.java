import java.util.HashMap;
import java.util.Map;

//5
public class Longest_Palindromic_Substring {
    public static String longestPalindrome(String s) {
        int longestLeng = 0;
        HashMap<Integer, int[]> result = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    result.put(j - i, new int[]{i, j});
                }
            }
        }
        for (int[] num : result.values()) {
            int temp = num[1] - num[0];
            if (temp > longestLeng) {
                longestLeng = temp;
            }
        }
        int[] numArr = result.get(longestLeng);

        return s.substring(numArr[0], numArr[1] + 1);
    }

    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(longestPalindrome(s));
    }
}
