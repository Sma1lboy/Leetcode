import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Max_Sum_of_a_Pair_With_Equal_Sum_of_Digits {
    public static int maximumSum(int[] nums) {
        //save same digits nums
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        //we ge total digits and every number
        for(int num : nums) {
            int digit = getDigit(num);
            if(!map.containsKey(digit)) {
                map.put(digit, new ArrayList<>());
            }
            map.get(digit).add(num);
        }
        //now we gothrough all key and find maximum value
        int max = -1;
        for(Integer key : map.keySet()){
            List<Integer> currList = map.get(key);
            if(currList != null && currList.size() >= 2) {
                currList.sort((a, b) -> b - a);
                max = Math.max(max, currList.get(0) + currList.get(1));
            }
        }
        return max;
    }
     static int getDigit(int num) {
        int sum = 0;
        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(maximumSum(new int[]{463,494,337,409,283,283,477,248,8,89,166,188,186,128}));
    }
}
