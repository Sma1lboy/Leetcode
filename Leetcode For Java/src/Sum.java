import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//15. 3sum
public class Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> ans = new ArrayList<>();
//        for(int i = 0; i < nums.length - 2; i++) {
//            for(int j = i; j < nums.length - 1; j++) {
//                for(int k = j; k < nums.length; k++) {
//                    int num1 = nums[i];
//                    int num2 = nums[j];
//                    int num3 = nums[k];
//                    if(i != j && j != k && num1 + num2 + num3 == 0) {
//                        List<Integer> tempArr = new ArrayList<>();
//                        tempArr.add(num1);
//                        tempArr.add(num2);
//                        tempArr.add(num3);
//                        System.out.println(tempArr);
//                        boolean isSub = false;
//                        for(List<Integer> tempList: ans) {
//                            isSub = isSubset(tempList, tempArr);
//                        }
//                        if(!isSub) {
//                            ans.add(tempArr);
//                        }
//                    }
//                }
//            }
//        }
//        return ans;

            // Sort the given array
            Arrays.sort(nums);

            List < List < Integer >> result = new ArrayList < > ();
            for (int num1Idx = 0; num1Idx + 2 < nums.length; num1Idx++) {
                // Skip all duplicates from left
                // num1Idx>0 ensures this check is made only from 2nd element onwards
                if (num1Idx > 0 && nums[num1Idx] == nums[num1Idx - 1]) {
                    continue;
                }

                int num2Idx = num1Idx + 1;
                int num3Idx = nums.length - 1;
                while (num2Idx < num3Idx) {
                    int sum = nums[num2Idx] + nums[num3Idx] + nums[num1Idx];
                    if (sum == 0) {
                        // Add triplet to result
                        result.add(Arrays.asList(nums[num1Idx], nums[num2Idx], nums[num3Idx]));

                        num3Idx--;

                        // Skip all duplicates from right
                        while (num2Idx < num3Idx && nums[num3Idx] == nums[num3Idx + 1]) {
                            num3Idx--;
                        }
                    } else if (sum > 0) {
                        // Decrement num3Idx to reduce sum value
                        num3Idx--;
                    } else {
                        // Increment num2Idx to increase sum value
                        num2Idx++;
                    }
                }
            }
            return result;

    }
    public static boolean isSubset(List<Integer> list, List<Integer> list2) {
        boolean isSubset = true;
            for(int i = 0; i < list.size(); i++) {
                if (!list.contains(list2.get(i))) {
                    isSubset = false;
                }
            }
        return isSubset;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> test = threeSum(nums);
        System.out.println(test);

    }
}
