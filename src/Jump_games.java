import java.util.Arrays;

public class Jump_games {
    class Solution {
        //top down
        public boolean canJump(int[] nums) {
            //initial the array
            int[] dp = new int[nums.length];
            Arrays.fill(dp, -1);
            return canJump(nums, 0, dp);
        }
        public boolean canJump(int[] nums, int index, int[] dp) {
            //base case if there is any jump greater or equal than last index step
            //which is means we find the path;
            if(index >= nums.length - 1) {
                return true;
            }
            //base case if any number value equal to zero, which is always false
            if(nums[index] == 0) {
                dp[index] = 0;
                return false;
            }
            //if the position already have memorzetion, check
            if(dp[index] != -1) {
                return dp[index] == 1;
            }
            //go through every could jump postion
            int jumps = nums[index];
            //tricks start at 1 step
            for(int i = 1;i <= jumps; i++) {
                if(canJump(nums, i + index, dp)) {
                    //if can reach the last index
                    //which is means curr index is the correct path to the last index
                    dp[index] = 1;
                    return true;
                }
            }
            //zero mean false
            dp[index] = 0;
            return false;
        }
    }
}
