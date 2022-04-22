import java.util.HashMap;
import java.util.Map;

//5
public class Longest_Palindromic_Substring {
    public static String longestPalindrome(String s) {
        int longestLength = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    if(j - i > longestLength) {
                        longestLength = j - i;
                        ans = s.substring(i, j + 1);
                        break;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "a";
        System.out.println(longestPalindrome(s));
    }
}
