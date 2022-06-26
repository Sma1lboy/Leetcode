/*
 * three version, the O(n*m) O(n + m) and O(1)
 */
public class Set_Matrix_Zeroes {
    public void setZeroes(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
//         we need a extra space for one index
        boolean rowZero = false;
//         determine which rows / columns should be zero
//         take a marker
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(mat[i][j] == 0) {
                    //first row be zero
                    mat[0][j] = 0;
                    //we only can set first column be zero when row greater than zero
                    if(i > 0) {
                        mat[i][0] = 0;
                    } else {
                        rowZero = true;
                    }
                }
            }
        }
        // we skiped the first cell we will handle it after
        for(int i = 1; i < rows; i++) {
            for(int j = 1; j < cols; j++) {
                if(mat[0][j] == 0 || mat[i][0] == 0) {
                    mat[i][j] = 0;
                }
            }
        }
        if(mat[0][0] == 0) {
            for(int i = 0; i < rows; i++) {
                mat[i][0] = 0;
            }
        }
        if(rowZero) {
            for(int j = 0; j < cols;j++) {
                mat[0][j] = 0;
            }
        }

    }
}
