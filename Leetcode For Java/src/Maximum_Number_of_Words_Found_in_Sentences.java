//2114
public class Maximum_Number_of_Words_Found_in_Sentences {
    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String s:sentences) {
            String[] temValue = s.split(" ");
            if (max < temValue.length) {
                max = temValue.length;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        //TEST HERE
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int max = mostWordsFound(sentences);
        System.out.println(max);
    }
}
