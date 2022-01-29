import java.util.Arrays;

//1528
public class Shuffle_String {
    public static String restoreString(String s, int[] indices) {
        String[] tempChar = s.split("");
        String[] result = new String[tempChar.length];
        int i = 0;
        for(int num:indices) {
            result[num] = tempChar[i];
            i++;
        }
        StringBuilder str = new StringBuilder();
        for (int j = 0; j < result.length; j++) {
            str.append(result[j]);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] nums = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, nums));
    }
}
