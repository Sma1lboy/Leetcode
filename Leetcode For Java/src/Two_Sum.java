import java.util.Arrays;
import java.util.HashMap;

//1
public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
////            for (int j = 0; j < nums.length; j++) {
////                if (nums[i] + nums[j] == target && i != j) {
////                    return new int[] {i , j};
////                }
////            }
////        }
////        return null;
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                res[0] = i;
                res[1] = map.get(target - nums[i]);
                return res;
            } else {
                map.put(nums[i], i);
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
