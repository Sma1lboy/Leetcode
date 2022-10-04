import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/15
 */
public class Find_Original_Array_From_Doubled_Array {
    public static void main(String[] args) {
        findOriginalArray(new int[]{1,3,4,2,6,8});
    }

        public static int[] findOriginalArray(int[] nums) {
            int n = nums.length;
            Arrays.sort(nums);
            int[] res = new int[n / 2];
            HashSet<Integer> set = new HashSet<>();
            int idx = 0;
            for(int i = 0 ; i < n; i++) {
                int curr = nums[i];
                set.add(curr);
                if(curr % 2 == 0 && set.contains(curr / 2)) {
                    res[idx++] = curr / 2;
                    set.remove(curr);
                    set.remove(curr / 2);
                }

            }
            return res;
        }
}
