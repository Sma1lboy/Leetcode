import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[index] = nums[i];
                index++;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
//        List<Integer> arr = new ArrayList<>();
//        arr.ad
    }
}
