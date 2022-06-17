public class Sort_Array_By_Parity {
    public int[] sortArrayByParity(int[] nums) {
        for(int i = 0, j = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                int temp = nums[j];
                nums[j++] = nums[i];
                nums[i] = temp;
            }

        }
        return nums;
    }
}
