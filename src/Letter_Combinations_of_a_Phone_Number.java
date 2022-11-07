import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number {
    public List<String> letterCombinations(String digits) {
        //check if digits is null or length is 0;
        if(digits == null || digits.length() == 0) {
            return new ArrayList<String>();
        }
        //create results list
        List<String> results = new ArrayList<>();
        //create hashmap
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backtracking(digits, 0, results, map, new StringBuilder());
        return results;
    }
    public void backtracking(String digits, int i, List<String> results, HashMap<Character, String> map, StringBuilder sb) {
        int leng = i;
        //base case when i met length, backtracking
        if(digits.length() == i) {
            results.add(sb.toString());
            return;
        }
        String curr = map.get(digits.charAt(i));
        for(char c : curr.toCharArray()) {
            sb.append(c);
            backtracking(digits, i + 1, results, map, sb);
            sb.setLength(i);
        }
    }
}
