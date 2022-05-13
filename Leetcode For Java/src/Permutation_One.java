import java.util.ArrayList;
import java.util.List;

public class Permutation_One {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        backtrack(ans, nums, 0);

        return ans;
    }
    public void backtrack(List<List<Integer>> ans, int[] nums, int index) {
        if (index >= nums.length) {
            List<Integer> res = new ArrayList<>();
            for(int i = 0; i < nums.length; i++) {
                res.add(nums[i]);
            }
            ans.add(res);
            return;
        }
        for ( int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            backtrack(ans, nums, index + 1);
            swap(nums, index, i);
        }
    }
    public void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
