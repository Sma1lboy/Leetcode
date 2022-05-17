public class Count_Negative_Numbers_in_a_Sorted_Matrix {
//    public int countNegatives(int[][] grid) {
//        int ans = 0;
//        int m = grid[0].length;
//        int n = grid.length;
//        int a = 0;
//        int b = 0;
//        while(a < m &&  b < n) {
//            if(grid[b][a] < 0) {
//                ans++;
//            }
//            if(a + 1 == m) {
//                b++;
//                a = 0;
//                continue;
//            }
//            a++;
//        }
//        return ans;
//    }

    public static int countNegatives(int[][] grid) {
        int m = grid[0].length;
        int n = grid.length;
        int count = 0;
        int res = 0;

        for(int i = 0; i < n; i++) {
            int start = 0;
            int end = m - 1;

            while(start <= end) {
                int mid = start + (end - start) / 2;

                if(grid[i][mid] < 0) {
                    count = m - mid;
                    end = mid - 1;
                } else if(grid[i][mid] >= 0) {
                    start = mid + 1;
                }


            }
            res += count;

        }
        return res;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}

        };
        System.out.println(countNegatives(arr));
    }
}
