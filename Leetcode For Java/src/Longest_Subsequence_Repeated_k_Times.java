import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/14
 */
public class Longest_Subsequence_Repeated_k_Times {
    public static void main(String[] args) {
        longestSubsequenceRepeatedK("letsleetcode", 2);
    }
    public static String longestSubsequenceRepeatedK(String s, int k) {
        final int N = 26;
        // q only stores valid subsequences, initialized with a empty string.
        Queue<String> q = new LinkedList<>();
        q.offer("");
        String res = "";

        while(!q.isEmpty()) {
            int size = q.size();

            //go through layer by layer
            for(int i = 0; i < size; i++) {
                String curr = q.poll();
                //go through every letter
                for(int j = 0; j < N; j++) {
                    String next = curr + (char)(j + 'a');
                    if(isSub(s, next, k)) {
                        res = next;
                        q.offer(next);
                    }
                }
            }

        }
        return res;

    }
    // check if sub * k is a subsequence of string s.
    private static boolean isSub(String s, String sub, int k ) {
        int repeat = 0;
        int j = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == sub.charAt(j)) {
                j++;
                if(j == sub.length()) {
                    repeat++;
                    //check if already met the k time
                    if(repeat == k) {
                        return true;
                    }
                    j = 0;
                }
            }
        }
        return false;
    }
}
