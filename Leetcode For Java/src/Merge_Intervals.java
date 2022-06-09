import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Intervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[][]{};
        }
            List<int[]> ans = new ArrayList<>();
            int start = intervals[0][0];
            int end = intervals[0][1];
            for (int i = 0; i < intervals.length; i++) {
                int s = intervals[i][0];
                int e = intervals[i][1];

                if (e <= end) {
                    end = Math.max(e, end);
                } else {
                    ans.add(new int[]{start, end});
                    start = s;
                    end = e;
                }
            }

            ans.add(new int[]{start, end});

            int[][] arr = new int[ans.size()][];
            for (int i = 0; i < arr.length; i++) {
                int[] temp = new int[]{ans.get(i)[0], ans.get(i)[1]};
                arr[i] = temp;
            }
            return arr;

    }
    public static void main(String[] args) {
        int[][] intervals = new int[][] {{1,3},{2,6},{8, 10}};
        System.out.println(Arrays.toString(merge(intervals)[1]));
    }


}
