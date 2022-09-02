/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/28
 */
public class Sliding_Window_Maximum {
    public static void main(String[] args) {
        System.out.println(maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3));

    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        int resIndex = 0;
        int currMax = nums[0];

        for(int lo = 0, hi = 0; hi < nums.length; hi++) {
            currMax = Math.max(currMax, nums[hi]);

            if(hi - lo + 1 >= k) {
                res[resIndex++] = currMax;
                lo++;
                if(currMax == nums[lo - 1]) {
                    currMax = Integer.MIN_VALUE;
                    for(int i = lo; i <= hi; i++) {
                        currMax = Math.max(currMax, nums[lo]);
                    }
                }
            }
        }
        return res;

    }
}
