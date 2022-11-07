import java.util.Arrays;

public class Minimum_Moves_to_Equal_Array_Elements {

    /**
     * sdsd
     *
     * @param nums
     * @return <img src="/Users/jacksonchen/Desktop/Screen Shot 2022-06-29 at 11.24.50 PM.png" />
     */
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int min = nums[0];
        for (int num : nums) {
            sum += num;
        }
        return sum - nums.length * min;
    }
}
