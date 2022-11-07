/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/20
 */
public class target_sum {

    public static void main(String[] args) {
        findTargetSumWays(new int[]{1,1,1,1,1}, 3);
    }
    //first version only recursion without memoiazation
    public static int findTargetSumWays(int[] nums, int target) {
        return recursion(nums, 0, 0, target);
    }

    public static int recursion(int[] nums, int currSum, int index, int target) {
        //base case
        if(currSum == target && index >= nums.length) {
            return 1;
        }
        if(index == nums.length) {
            return 0;
        }

        return recursion(nums, currSum + nums[index], index + 1, target) + recursion(nums, currSum + -nums[index], index + 1, target);
    }
}
