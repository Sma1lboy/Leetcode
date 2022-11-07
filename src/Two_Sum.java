import java.util.Arrays;
import java.util.HashMap;

//1
public class Two_Sum {
    public static void main(String[] args) {
        twoSum(new int[]{2,7,11,15}, 9);
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            if(map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
