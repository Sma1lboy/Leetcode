public class Reshape_the_Matrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length == r && mat[0].length == c) {
            return mat;
        }
        if(mat[0].length * mat.length != r * c) {
            return mat;
        }


        int[][] res = new int[r][c];
        int a = 0;
        int b = 0;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                res[i][j] = mat[a][b];
                b++;
                if(b == mat[0].length) {
                    a++;
                    b = 0;
                }
            }
        }
        return res;

    }
}
