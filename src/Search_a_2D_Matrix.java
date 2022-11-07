public class Search_a_2D_Matrix {
        public static boolean searchMatrix(int[][] mat, int target) {
            int rows = mat.length, cols = mat[0].length;
            for(int i = 0; i < rows; i++) {
                if(target < mat[i][cols - 1]) {
                    int left = 0;
                    int right = cols - 1;
                    while( left <= right ) {
                        int mid = left + (right - left) / 2;
                        if(mat[i][mid] == target) {
                            return true;
                        } else if (mat[i][mid] < target) {
                            right = mid - 1;
                        } else if (mat[i][mid] > target) {
                            right = mid + 1;
                        }
                    }
                } else if(mat[i][cols - 1] == target) {
                    return true;
                }
            }
            return false;
        }

    public static void main(String[] args) {
        searchMatrix(new int[][]{{1,3,5}}, 1);
    }
}
