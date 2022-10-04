/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/20
 */
public class Maximum_Length_of_Repeated_Subarray {
    public static void main(String[] args) {
        int length = findLength(new int[]{0,1,1,1,1}, new int[]{1,0,1,0,1});
        System.out.println(length);
    }
    //iterate from top left to bottom right
    public static int findLength(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length][nums2.length];
        //initial top boarder
        for(int i = 0; i < nums1.length; i++) {
            if(nums1[i] == nums2[0]) {
                dp[0][i] = 1;
            }
        }
        //initial left boarder
        for(int i = 0; i < nums2.length; i++) {
            if(nums2[i] == nums1[0]) {
                dp[i][0] = 1;
            }
        }
        int max = 0;
        for(int i = 1; i < dp.length; i++) {
            for(int j = 1; j < dp[0].length; j++) {
                dp[i][j] = dp[i - 1][j - 1] + (nums1[j] == nums2[i] ? 1 : 0);
                max = Math.max(max, dp[i][j]);
            }
        }
        return max;

    }
}
