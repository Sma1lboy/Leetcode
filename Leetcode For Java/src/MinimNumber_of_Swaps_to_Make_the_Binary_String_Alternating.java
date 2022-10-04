/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/14
 */
public class MinimNumber_of_Swaps_to_Make_the_Binary_String_Alternating {
    public static void main(String[] args) {
        int i = minSwaps("111000");
        System.out.println(i);
    }

    public static int minSwaps(String s) {
        int one = 0, zero = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '0') {
                zero++;
            } else {
                one++;
            }
        }
        if (Math.abs(one - zero) > 1) {
            return -1;
        }
        // if number of ones greater than number of zero, then our first character is one

        if (one > zero) {
            return helper(s, '1');
        } else if (zero > one) { // otherwise first character is zero
            return helper(s, '0');
        }

        // if one == zero we will get the minimum swap
        return Math.min(helper(s, '0'), helper(s, '1'));
    }

    private static int helper(String s, char c) {
        int swap = 0;
        for (char ch : s.toCharArray()) {
            if (ch != c) {
                swap++;
            }
            c ^= 1;

        }
        return swap / 2;
    }
}
