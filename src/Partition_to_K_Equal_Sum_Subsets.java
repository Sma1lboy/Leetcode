import java.util.Arrays;

public class Partition_to_K_Equal_Sum_Subsets {
    class Solution {
        //it must divisble by k
        //nums.length must >= k
        public boolean canPartitionKSubsets(int[] nums, int k) {
            //check k <= nums.length
            if(nums.length < k) {
                return false;
            }

            int sum = 0;
            for(int num : nums) {
                sum += num;
            }
            if (sum % k != 0) return false;
            Arrays.sort(nums);
            return dfs(nums, new int[k], nums.length - 1, sum /k);
        }
        //go through this dfs by desc, because
        public boolean dfs(int[] nums, int[] sums, int index, int target) {
            if(index == -1 ) {
                return true;
            }
            for(int i = 0; i < sums.length; i++) {
                if(sums[i] + nums[index] > target) continue;

                sums[i] += nums[index];
                if(dfs(nums, sums, index - 1, target)) {
                    return true;
                }
                sums[i] -= nums[index];

                //if they dont add it into sum, if any of the number in the array is larger than the target sum sum / k, which we know immediately that we should return false
                if(sums[i] == 0) {
                    return false;
                }
            }
            return false;

        }
    }
}
