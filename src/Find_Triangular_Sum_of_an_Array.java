import java.util.ArrayList;
import java.util.List;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/7
 */
public class Find_Triangular_Sum_of_an_Array {
    public static void main(String[] args) {
        int i = triangularSum(new int[]{1, 2, 3, 4, 5});
        System.out.println(i);
    }

    public static int triangularSum(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        while (list.size() > 1) {
            List<Integer> tempList = new ArrayList<>();
            for (int i = 0; i < list.size() - 1; i++) {
                int curr = list.remove(0);
                tempList.add((curr + list.get(0)) % 10);
            }
            list = new ArrayList<>(tempList);
        }
        return list.get(0);
    }
}
