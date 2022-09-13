/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/11
 */
public class Longest_Increasing_Subsequence {

    public static void main(String[] args) {
        lengthOfLIS(new int[]{10,9,2,5,3,7,101,18});
    }
    public static int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length];

        int size = 0;
        for(int num : nums) {
            int l = 0, r = size;
            while(l < r) {
                int mid = l + (r - l) / 2;
                if(tails[mid] < num) {
                    l = mid + 1;
                } else {
                    r = mid;
                }
            }
            tails[l] = num;
            if(l == size) {
                size++;
            }
        }
        return size;
    }
}
