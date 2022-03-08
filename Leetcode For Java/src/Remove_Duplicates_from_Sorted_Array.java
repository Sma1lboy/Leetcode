import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] nums) {

        int temp = nums[0];
        int k = 1;
        ArrayList<Integer> tempList = new ArrayList<>();
        tempList.add(0);
        for (int i = 1; i < nums.length; i++) {
            if (temp != nums[i]) {
                temp = nums[i];
                tempList.add(i);
                k++;
            }
        }
        for (int j = 0; j < tempList.size(); j++) {
            nums[j] = nums[tempList.get(j)];
        }
        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }

        return k;

    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));

    }
}
