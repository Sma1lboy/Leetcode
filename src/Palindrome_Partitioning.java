import java.util.ArrayList;
import java.util.List;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/20
 */
public class Palindrome_Partitioning {
    public static void main(String[] args) {
        List<List<String>> aab = partition("aab");
        aab.forEach(a -> System.out.println(a));
    }
    public static List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        dfs(s, 0, list, new ArrayList<>());
        return list;
    }

    private static void dfs(String s, int idx, List<List<String>> list, List<String> tempList) {
        if(idx == s.length()) {
            list.add(new ArrayList<>(tempList));
        }
        for(int i = idx; i < s.length(); i++) {
            if(isPal(s.substring(idx, i + 1))) {
                tempList.add(s.substring(idx, i + 1));
                dfs(s, i, list, tempList);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
    private static boolean isPal(String str) {
        int left = 0, right = str.length() - 1;
        while(left <= right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
