import java.util.Arrays;

public class Minimum_Moves_to_Equal_Array_Elements {
    public static int minMoves2(int[] nums) {
        //length
        int len = nums.length;
        //sort first
        Arrays.sort(nums);
        //find the median number
        int median = nums[len/2];
        int res = 0;
        for(int num : nums) {
            res += Math.abs(num-median);
        }
        return res;

    }

    public static void main(String[] args) {
        int[] arr = {1,10,2,9};
        System.out.println(minMoves2(arr));
    }
}
