import java.util.ArrayList;
import java.util.List;

public class Subsets {
    class Solution {
        //no dupcate, not permutation
        //backtracking but brute force backtracking
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> list = new ArrayList<>();
            backtracking(list , new ArrayList<>(), nums, 0);
            return list;
        }
        public void backtracking(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
            //no base case to terminet
            //but we have to add every subset into our list
            list.add(new ArrayList<>(tempList));
            for(int i = start; i < nums.length; i++){
                tempList.add(nums[i]);
                backtracking(list, tempList, nums, i+1);
                tempList.remove(tempList.size() - 1);
            }

        }
    }
}
