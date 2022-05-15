import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Intersection_of_Two_Arrays_two {
//        public static int[] intersect(int[] nums1, int[] nums2) {
//            HashMap<Integer, Integer> map = new HashMap<>();
//
//            for(int i =0 ; i < nums1.length; i++) {
//                map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
//            }
//            List<Integer> res = new ArrayList<>();
//            for(int i = 0; i< nums2.length; i++) {
//                if (map.containsKey(nums2[i]) && map.get(nums2[i])!=0) {
//                    res.add(nums2[i]);
//                    map.put(nums2[i], map.get(nums2[i])-1);
//                }
//            }
//            return res.stream().mapToInt(i->i).toArray();
//        }
public static int[] intersect(int[] nums1, int[] nums2) {
    int[] arr1 = new int[1001];
    List<Integer> list = new ArrayList<>();
    for(int num : nums1) {
        arr1[num]++;
    }
    for(int num : nums2) {
        if(arr1[num] > 0) {
            list.add(num);
            arr1[num]--;
        }
    }
    int[] res = new int[list.size()];
    for(int i =0; i < list.size(); i++) {
        res[i] = list.get(i);
    }
    return res;
}
    public static void main(String[] args) {
        int[] num1 = {
                4,9,5
};
        int[] num2 = {9,4,9,8,4};
        int[] num3 = intersect(num1,num2);
        System.out.println(Arrays.toString(num3));
    }
}
