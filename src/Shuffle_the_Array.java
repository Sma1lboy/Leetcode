import java.util.Arrays;

//1470
public class Shuffle_the_Array {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        //updating number
        int j = 0;
        for (int i = 0; i < n; i++) {
            //x
            result[j] = nums[i];
            System.out.println(Arrays.toString(result));
            j++;
            //y
            result[j] = nums[i + n];
            System.out.println(Arrays.toString(result));
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;

        int[] result = shuffle(nums, n);
        System.out.println(Arrays.toString(result));

    }
}
