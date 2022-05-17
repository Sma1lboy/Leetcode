public class Reverse_Words_in_a_String_three {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String str : arr) {
            String temp = reverse(str);
            sb.append(temp).append(" ");
        }
        return sb.toString().trim();
    }
    public String reverse(String s) {

        if(s.length() > 0) {
            String sub = s.substring(0, s.length() - 1);
            return s.substring(s.length() - 1) + reverse(sub);
        } else {
            return s;
        }

    }



//    public String reverseWords(String s) {
//        int left = 0;
//        int right = 0;
//        char[] words = s.toCharArray();
//        while(left < words.length){
//            right = nextSpace(left, words);
//            reverse(left, right-1, words);
//
//            left = right + 1;
//        }
//        return new String (words);
//    }
//    public int nextSpace(int left, char[] words) {
//        for(int i = left; i < words.length; i++) {
//            if(words[i] == ' ') return i;
//        }
//        return words.length;
//    }
//    public void reverse(int left, int right, char[] words) {
//        while(left <= right) {
//            char temp = words[left];
//            words[left] = words[right];
//            words[right] = temp;
//            left++;
//            right--;
//        }
//    }
}
