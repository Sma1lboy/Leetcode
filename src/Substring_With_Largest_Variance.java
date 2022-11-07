/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/5
 */
public class Substring_With_Largest_Variance {
    public static void main(String[] args) {
        largestVariance("aababbb");
    }
    public static int largestVariance(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int maxVar = 0;
        for(int a = 0; a < 26; a++) {
            for(int b = 0; b < 26; b++) {
                int remainingA = freq[a];
                int remainingB = freq[b];

                //keep going until a != b and a and b not null
                if(a == b || remainingA ==0 || remainingB == 0) continue;

                int currFreqA = 0, currFreqB = 0;
                for(int i = 0; i < s.length(); i++) {
                    int c = s.charAt(i) - 'a';

                    if(c == b) currFreqB++;
                    if(c == a) {
                        currFreqA++;
                        remainingA--;
                    }
                    if(currFreqA > 0) {
                        maxVar = Math.max(maxVar, currFreqB - currFreqA);
                    }
                    if(currFreqB < currFreqA && remainingA >= 1) {
                        currFreqA = 0;
                        currFreqB = 0;

                    }
                }
            }
        }
        return maxVar;
    }
}
