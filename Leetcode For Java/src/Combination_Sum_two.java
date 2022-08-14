import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_two {
    //TODO we could optimazation it using set rather than list,
    public static List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        //sort
        Arrays.sort(nums);
        backtracking(list, new ArrayList<>(), nums, target, 0);
        return list;
    }
    public static void backtracking(List<List<Integer>> list, List<Integer> sublist, int[] nums, int remain, int i) {
        //base case when ramain les than zero, its wrong path
        if(remain < 0) {
            return;
        }
        //base case if it is zero, we find correct path
        if(remain == 0) {
            list.add(new ArrayList<>(sublist));
            return;
        }
        for(int k = i; k < nums.length; k++) {
            //check if there is dupulicate
            if(k > i && nums[k] == nums[k-1]){
                continue;
            }
            sublist.add(nums[k]);
            backtracking(list, sublist,nums, remain - nums[k], k + 1);
            sublist.remove(sublist.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
    }
}
