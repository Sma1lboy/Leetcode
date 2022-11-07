import java.util.ArrayList;
import java.util.List;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/22
 */
public class Find_Good_Days_to_Rob_the_Bank {
    public static void main(String[] args) {
        goodDaysToRobBank(new int[]{5,3,3,3,5,6,2}, 2);
    }

    public static List<Integer> goodDaysToRobBank(int[] A, int time) {
        List<Integer> list = new ArrayList<>();
        int[] nonIncrease = new int[A.length];
        for (int i = 1; i < A.length - time; i++) {
            if (A[i] <= A[i - 1]) {
                nonIncrease[i] = nonIncrease[i - 1] + 1;
            }
        }
        int[] nonDecrease = new int[A.length];
        for (int i = 1; i <= A.length - time; i++) {
            if (A[i] >= A[i - 1]) {
                nonDecrease[i] = nonDecrease[i - 1] + 1;
            }
        }
        for (int i = time; i < A.length - time; i++) {
            if (nonDecrease[i] >= time && nonIncrease[i] >= time) {
                list.add(i);
            }
        }
        return list;
    }
}
