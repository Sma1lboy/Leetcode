import java.util.Arrays;

public class Minimum_Difference_Between     {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        int zeroIndexK = k - 1;
        for(int i = zeroIndexK; i < nums.length; i++) {
            int high = nums[i];
            int low = nums[i - zeroIndexK];
            int difference = high - low;
            res = Math.min(difference, res);
        }
        return res;
    }
}
