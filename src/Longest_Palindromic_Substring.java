import java.util.HashMap;
import java.util.Map;

//5
public class Longest_Palindromic_Substring {
    public String longestPalindrome(String s) {
        String res = "";
        int resLen = 0;
        if(s.length() < 2) return s;
        for(int i = 0; i < s.length(); i++) {
            //if the palindrome is odd
            int l = i, r = i; // left pointer and right pointer
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                //check if rn resLen is greter than max resLen
                if((r - l + 1) > resLen) {
                    res = s.substring(l, r + 1);
                    resLen = r - l + 1;
                }
                l -=1;
                r +=1;
            }
            //even version
            l = i;
            r = i + 1;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                //check if rn resLen is greter than max resLen
                if((r - l + 1) > resLen) {
                    res = s.substring(l, r + 1);
                    resLen = r - l + 1;
                }
                l -=1;
                r +=1;
            }
        }
        return res;
    }
}
