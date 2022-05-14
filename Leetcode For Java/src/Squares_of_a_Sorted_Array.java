public class Squares_of_a_Sorted_Array {
    public int[] sortedSquares(int[] nums) {
        int l = 0, f = nums.length - 1;
        int[] ans = new int[nums.length];
        int i = nums.length - 1;
        while(l <= f) {
            if(Math.abs(nums[l]) > Math.abs(nums[f])) {
                ans[i--] = nums[l] * nums[l++];
            } else {
                ans[i--] = nums[f] * nums[f--];
            }
        }
        return ans;
    }
}
