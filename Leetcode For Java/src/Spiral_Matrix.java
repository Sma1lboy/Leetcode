import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    public static List<Integer> spiralOrder(int[][] mat) {
        List<Integer> list = new ArrayList<>();
        //find the left right top bot
        int left = 0, right = mat[0].length - 1;

        int top = 0, bottom = mat.length - 1;
        //start at zero zero
        while(left <= right && top <= bottom) {
            //traverse right
            for(int i = left; i <= right; i++) {
                list.add(mat[top][i]);
            }
            //first row over, and time to go down
            top++;
            //traverse down
            for(int i = top; i <= bottom; i++) {
                list.add(mat[i][right]);
            }
            //done then right row over
            right--;
            if (top <= bottom) {
                //traverse left
                for(int i = right; i >= left; i--) {
                    list.add(mat[bottom][i]);
                }
            }
            bottom--;
            if(left <= right) {
                //traverse top
                for(int i = bottom ; i >= top; i--) {
                    list.add(mat[i][left]);
                }
            }
            left++;
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        List<Integer> ans = spiralOrder(mat);
        System.out.println(ans);

    }
}
