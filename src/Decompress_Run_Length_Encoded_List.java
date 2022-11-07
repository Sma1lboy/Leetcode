import java.util.Arrays;
import java.util.HashMap;

//1313
public class Decompress_Run_Length_Encoded_List {
    public static int[] decompressRLElist(int[] nums) {
        int size = 0;
        for(int i = 0; i < nums.length; i += 2)
            size += nums[i];

        int[] result = new int[size];
        for(int i = 0, j = 0; i < nums.length; i += 2) {
            while(nums[i]-- > 0) {
                result[j] = nums[i + 1];
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = decompressRLElist(nums);
        System.out.println(Arrays.toString(result));

    }
}
