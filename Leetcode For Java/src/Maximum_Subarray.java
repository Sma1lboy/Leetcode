public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int finalSum = nums[0];
        for(int i : nums) {
            currSum = currSum + i;
            finalSum = Math.max(finalSum, currSum);
            if(currSum < 0) {
                currSum = 0;
            }
        }
        return finalSum;
    }
}
