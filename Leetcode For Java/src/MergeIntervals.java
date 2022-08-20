import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/20
 */
public class MergeIntervals {class Solution {
    public int[][] merge(int[][] intervals) {
        //base case
        if(intervals.length <= 1) {
            return intervals;
        }

        //sort by ascending sort
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> list = new ArrayList<>();
        //the idea from insert interval
        int[] newInterval = intervals[0];
        list.add(newInterval);

        for(int[] interval : intervals) {
            if(interval[0] <= newInterval[1]) {
                newInterval[1] = Math.max(interval[1], newInterval[1]);
                newInterval[0] = Math.min(interval[0], newInterval[0]);
            } else {
                //once we find one interval not overlapping with newInterval, we could
                // add newInterval into list set new newInterval;
                newInterval = interval;
                list.add(newInterval);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}

}
