public class Unique_Paths {
    /**
     *
     * @param m
     * @param n
     * @return
     * <url src="https://assets.leetcode.com/uploads/2018/10/22/robot_maze.png"></url>
     */
    public int uniquePaths(int m, int n) {
        //thinkng the 0 index vertical and 0 index horizontal are only have one passible path
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
            dp[i][0] = 1;
        }
        for(int i = 0; i < n; i++){
            dp[0][i] = 1;
        }
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
