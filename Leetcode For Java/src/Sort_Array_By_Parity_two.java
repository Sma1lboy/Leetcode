public class Sort_Array_By_Parity_two {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1;
        while(l < n &&  r >= 0) {
            if(nums[l] % 2 == 0) {
                l += 2;
            } else if (nums[r] % 2 == 1) {
                r -= 2;
            } else {
                swap(nums, l, r );
            }
        }
        return nums;
    }
    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
