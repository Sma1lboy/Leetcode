/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/14
 */
public class Longest_Mountain_in_Array {
    public static void main(String[] args) {
        longestMountain(new int[]{2,1,4,7,3,2,5});
    }

    public static int longestMountain(int[] arr) {
        int max = 0;
        int n = arr.length;
        if (n < 3) return max;
        int left = 0, right = 0;

        while (left < n - 2) {
            // skip decending
            while (left < n - 1 && arr[left] >= arr[left + 1]) {
                left++;
            }

            // mountain up
            right = left + 1;
            while (right < n - 1 && arr[right] < arr[right + 1]) {
                right++;
            }
            // mountain down
            while (right < n - 1 && arr[right] > arr[right + 1]) {
                right++;
                max = Math.max(max, right - left + 1);
            }
            left = right;
        }
        return max;

    }
}
