import java.util.HashMap;
//1859
public class Sorting_the_Sentence {
    public static String sortSentence(String s) {
        String[] strs = s.split(" ");
        HashMap<Integer, String> hm = new HashMap<>();
        String ans = "";
        for(String tempS: strs) {
            hm.put(Integer.parseInt(tempS.substring(tempS.length() - 1)), tempS.substring(0, tempS.length() - 1));
        }
        for (int i = 1; i <= strs.length; i++) {
            ans += hm.get(i);
            if (i != strs.length) {
                ans += " ";
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
}
