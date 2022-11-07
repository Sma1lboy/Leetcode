import java.util.HashMap;

public class Longest_Repeating_Character_Replacement {
    public int characterReplacement(String s, int k) {
        //create freq map
        HashMap<Character, Integer> map = new HashMap<>();
        //create pointer
        int l = 0, r = 0;
        //result length
        int res = 0;
        //maximum repeat character
        int maxRepeat = 0;
        while(l < s.length() && r < s.length()) {
            char c = s.charAt(r);
            //put character into freq map
            map.put(c, map.getOrDefault(c, 0) + 1);
            //check if the now character could become biggest character or not
            maxRepeat = Math.max(maxRepeat, map.get(c));
            int countLen = r - l + 1;
            if( (countLen - maxRepeat) > k ) {
                //sliding the window through left shift 1
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                l++;
            }
            res = Math.max(res, r - l + 1);
            r++;
        }
        return res;
    }
}
