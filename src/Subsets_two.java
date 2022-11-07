import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets_two {
    //no dupcate, not permutation
    //backtracking but brute force backtracking
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtracking(list , new ArrayList<>(), nums, 0);
        return list;
    }
    public void backtracking(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
        //no base case to terminet
        //but we have to add every subset into our list
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            //the way to jump over dupilicate
            if(i > start && nums[i- 1] == nums[i]) {continue;}
            tempList.add(nums[i]);
            backtracking(list, tempList, nums, i+1);
            tempList.remove(tempList.size() - 1);
        }

    }
}
