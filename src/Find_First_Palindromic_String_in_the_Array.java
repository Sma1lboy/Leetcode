public class Find_First_Palindromic_String_in_the_Array {
    public String firstPalindrome(String[] words) {

        for(String s: words) {
            if(isPalindrome(s)) {
                return s;
            }
        }
        return "";
    }
    public boolean isPalindrome(String s) {

        for(int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            if(s.charAt(i) != s.charAt(j)) return false;
        }

        return true;
    }

}
