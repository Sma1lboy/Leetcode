/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/13
 */
public class Reorganize_String {

    public static void main(String[] args) {
        reorganizeString("vvvlo");
    }
    public static String reorganizeString(String s) {
        int[] map = new int[26];
        for(char ch : s.toCharArray()) {
            map[ch - 'a']++;
        }

        //find the letterIndex with largest occurent
        int max = 0, letterIndex = 0;
        for(int i = 0; i < map.length; i++) {
            if(map[i] > max) {
                max = map[i];
                letterIndex = i;
            }
        }
        //if max over the half of total length, which means we cannot separate it into AxA format
        if(max > (s.length() + 1) / 2) {
            return "";
        }
        char[] chars = new char[s.length()];
        int idx = 0;
        //put most freq letter into even char array
        while(map[letterIndex] > 0) {
            chars[idx] = (char) (letterIndex + 'a');
            idx += 2;
            map[letterIndex]--;
        }
        for(int i = 0; i < map.length; i++) {
            while(map[i] > 0) {
                if(idx >= s.length()) {
                    idx = 1;
                }
                chars[idx] = (char) (i + 'a');
                idx += 2;
                map[i]--;
            }
        }
        return String.valueOf(chars);

    }
}
