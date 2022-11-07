import java.util.ArrayList;
import java.util.List;

//classic backtracking question
public class Combination_sum {
    class Solution {
        //combiantion rather permutation

        public List<List<Integer>> combinationSum(int[] nums, int target) {
            List<List<Integer>> list = new ArrayList<>();
            dfs(0, target, list, new ArrayList<>(), nums);
            return list;
        }
        //remain is more apporiate to total
        public void dfs(int i, int remain, List<List<Integer>> list, List<Integer> tempList, int[] nums) {
            //base case if ramain smaller than 0 which is means its not correct path
            if(remain < 0 ) return;
            //if remain == 0, then we find the correct path
            if(remain == 0) {
                //dont do list.add(tempList) this only add the reference value rather than object value
                list.add(new ArrayList<>(tempList));
                return;
            }
            //go through every point start at i
            for(int k = i; k < nums.length; k++) {
                tempList.add(nums[k]);
                dfs(k, remain - nums[k], list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }

        }
    }
}
