import java.util.LinkedList;
import java.util.Queue;

public class zero_one_Matrix {
    public static int[][] updateMatrix(int[][] matrix) {
        Queue<int[]> q = new LinkedList<>();
        int[][] mat = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length;j++) {
                if(matrix[i][j] == 0) {
                    mat[i][j] = 0;
                    q.add(new int[]{i, j});
                } else {
                    mat[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        while(!q.isEmpty()) {
            int[] cell = q.remove();
            int r =  cell[0], c = cell[1];
            for(int i = 0; i < dir.length; i++) {
                int newR = r + dir[i][0];
                int newC = c + dir[i][1];
                if(newR >= 0 && newR < mat.length && newC >= 0 && newC < mat[0].length) {
                    if(mat[newR][newC] > mat[r][c]) {
                        mat[newR][newC] = mat[r][c] + 1;
                        q.add(new int[]{newR, newC});
                    }
                }
            }
        }
        return mat;
    }
    public final static int[][] dir = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};   
}
