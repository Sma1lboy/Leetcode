import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/11
 */
public class Most_Frequent_Even_Element {

    public static void main(String[] args) {
        int i = mostFrequentEven(new int[]{4369, 3347, 7166, 1792, 9101, 6887, 4418, 7038, 5287, 1630, 9023, 1368, 8972, 8092, 1120, 7050, 8661, 1297, 3013, 4504, 9578, 9399, 6196, 2383, 8801, 2120});
        System.out.println(i);
    }
    public static int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        int max = 0, res = -1;
        for(Integer key : nums){
            //if it is even
            if(key % 2 == 0) {
                if(max < map.get(key)) {
                    res = key;
                    max = map.get(key);
                }
            }

        }
        return res;
    }
}
