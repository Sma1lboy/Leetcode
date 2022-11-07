import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/30
 */
public class Three_sum {
    public static void main(String[] args) {
        threeSum(new int[]{-1,0,1,2,-1,-4});
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            //avoid repeat number
            while (i > 0 && nums[i - 1] == nums[i]) continue;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    //avoid repeat number
                    while (j < k && nums[j - 1] == nums[j]) {
                        j++;
                    }

                }

            }

        }
        return list;
    }
}
