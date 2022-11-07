import java.util.HashSet;
//8
public class String_to_Integer {
    public static int myAtoi(String s) {
        int result = 0;

        int len = s.length();
        int index = 0;
        //check the length
        if (s.length() == 0) {
            return 0;
        }
        //jump whiteSpace
        while (index < len && s.charAt(index) == ' ') {
            ++index;
        }

        boolean isNegative = false;
        //determine is negative or not;
        if (index < len) {
            if (s.charAt(index) == '-') {
                isNegative = true;
                index++;
            } else if (s.charAt(index) == '+') {
                //positive
                index++;
            }
        }


        while (index < s.length() && isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
            if (result > (Integer.MAX_VALUE / 10) || (result == (Integer.MAX_VALUE / 10) && digit > 7)) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        return isNegative ? -result : result;
    }

    public static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    public static void main(String[] args) {


        System.out.println(myAtoi("2147483648"));
    }
}
