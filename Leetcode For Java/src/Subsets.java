import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        subsets(new int[]{1,2,3});
    }

    // no dupcate, not permutation
    // backtracking but brute force backtracking
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtracking(list, new ArrayList<>(), nums, 0);
        return list;
    }

    public static void backtracking(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
        if(nums.length == start) {
            list.add(new ArrayList<>(tempList));
            return;
        }
        // no base case to terminet
        // but we have to add every subset into our list
        list.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtracking(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }

    }
}
