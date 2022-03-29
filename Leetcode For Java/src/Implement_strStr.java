public class Implement_strStr {
    public static int strStr(String haystack, String needle) {
        int ans = -1;

        for (int i = 0; i < haystack.length(); i++) {
            if (i + needle.length() > haystack.length()) break;
            for (int j = 0; j < haystack.length(); j++) {
                if (haystack.charAt(i+j) != needle.charAt(j)) {
                    break;
                }
                if (j == needle.length()-1) {
                    ans = i;
                }
            }
        }

        return ans;
    }
}
