import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maximum_Number_of_Pairs_in_Array {
    public static void main(String[] args) {

    }
    public static int[] numberOfPairs(int[] nums) {
        int numPair = 0;
        for(int i = 0; i < nums.length - 1;i++) {
            if(nums[i] == -1) {
                continue;
            }
            int charVal = nums[i];
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    numPair++;
                    nums[i] = -1;
                    nums[j] = -1;
                    break;
                }
            }
        }
        int count = 0;
        for(int num : nums) {
            if(num == - 1) {
                continue;
            }
            count++;
        }
        return new int[] {numPair,count};
    }
}
