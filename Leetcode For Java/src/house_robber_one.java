public class house_robber_one {
    class Solution {
        //thinking: the recursion relation is max = (arr[0] + rob(2:n), rob[1:n])
        //we could break it
        public int rob(int[] nums) {
            int n = nums.length;

            int rob1 = 0,  rob2 = 0;
//         #[rob1, rob2, num, num + 1, num + 2...]
            for(int num : nums) {
                int temp = Math.max(num + rob1, rob2);
                rob1 = rob2;
                rob2 = temp;
            }
            return Math.max(rob1, rob2);

        }
    }
}
