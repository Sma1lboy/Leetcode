import java.util.Arrays;

//1
public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    return new int[] {i , j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int [] nums = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
