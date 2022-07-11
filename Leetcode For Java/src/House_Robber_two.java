import java.util.Arrays;

public class House_Robber_two {
    class Solution {
        public int rob(int[] nums) {
//         break the nums into two array, the first (0, nums - 2), second (1, nums -1)
            int n = nums.length;
            if(n == 1) {
                return nums[0];
            }
            int[] arr1 = Arrays.copyOfRange(nums, 0, n -1);
            int[] arr2 = Arrays.copyOfRange(nums, 1, n );
            return Math.max(rob1(arr1), rob1(arr2));
        }
        public int rob1(int[] nums) {
            int dp1 = 0, dp2 = 0;
//         #[dp1, dp2, num, num + 1 ...]
            for(int num : nums) {
                int temp = Math.max(num + dp1, dp2);
                //move dp1 to dp2 ,dp2 to temp
                dp1 = dp2;
                dp2 = temp;
            }
            return Math.max(dp1, dp2);
        }
    }
}
