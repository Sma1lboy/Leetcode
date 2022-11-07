public class Reverse_Only_Letters {
    public String reverseOnlyLetters(String s) {
        int i = 0, j = s.length() - 1;
        char[] rev = s.toCharArray();
        while(i <= j) {
            if(!Character.isLetter(rev[i])) {
                i++;
            } else if(!Character.isLetter(rev[j])) {
                j--;
            } else {
                char temp = rev[i];
                rev[i] = rev[j];
                rev[j] = temp;
                i++;
                j--;
            }
        }
        return String.valueOf(rev);
    }
}
