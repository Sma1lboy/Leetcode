import java.util.Arrays;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int j = 0;
        for (int num : nums) {
            int numSmaller = 0;
            for (int i = 0; i < nums.length; i++) {
                if (num > nums[i]) {
                    numSmaller++;
                }
            }
            result[j] = numSmaller;
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num = {8,1,2,2,3};
        int[] result = smallerNumbersThanCurrent(num);
        System.out.println(Arrays.toString(result));
    }
}
