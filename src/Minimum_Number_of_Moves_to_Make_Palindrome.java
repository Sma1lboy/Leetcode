/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/8
 */
public class Minimum_Number_of_Moves_to_Make_Palindrome {
    public static void main(String[] args) {
        minMovesToMakePalindrome("aabb");
    }
    public static int minMovesToMakePalindrome(String s) {
        int res = 0;
        while(s.length() > 0) {
            int i  = s.indexOf(s.charAt(s.length() - 1));
            if(i == s.length() - 1) {
                res += i / 2;
            } else  {
                res += i;
                s = s.substring(0, i) +  s.substring(i + 1);
            }
            s = s.substring(0, s.length() - 1);
        }
        return res;
    }
}
