import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/11
 */
public class FourSum {


    public static void main(String[] args) {
        fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296);
    }
    // the generailized way to ksum
    static int len = 0;

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        len = nums.length;
        Arrays.sort(nums);
        return kSum(nums, 4, target, 0);
    }

    private static List<List<Integer>> kSum(int[] nums, int k, int target, int index) {
        List<List<Integer>> list = new ArrayList<>();
        if (index >= len) {
            return list;
        }
        if (k == 2) {
            int i = index, j = len - 1;
            while (i < j) {
                long sum = (long) nums[i] + nums[j];
                if (sum == target) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    list.add(new ArrayList<>(temp));
                    // avoid duplication
                    while (i < j && nums[i] == nums[i + 1]) i++;
                    while (i < j && nums[j - 1] == nums[j]) j--;
                    i++;
                    j--;
                } else if (sum < target) {
                    i++;
                } else {
                    j--;
                }
            }
        } else {
            for (int i = index; i < len - (k - 1); i++) {
                if (i > index && nums[i] == nums[i - 1]) continue;
                List<List<Integer>> temp = kSum(nums, k - 1, (int)((long)target - nums[i]), i + 1);
                for (List<Integer> t : temp) {
                    t.add(0, nums[i]);
                }
                list.addAll(temp);
            }
        }
        return list;
    }
}
