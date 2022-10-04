package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/17
 */
public class test
{

    public static void main(String[] args) {
        List<Integer> integers = goodIndices(new int[]{388589,17165,726687,401298,600033,537254,301052,151069,399955}, 4);
        System.out.println(integers);
    }

    public static List<Integer> goodIndices(int[] nums, int k) {
        int len = nums.length;
        int[] nonincrease = new int[len];
        for(int i = 1; i < len - k; i++) {
            if(nums[i] > nums[i - 1]) {
                nonincrease[i] = nonincrease[i - 1] != 0 ? nonincrease[i - 1] + 1: 0;
            } else {
                nonincrease[i] = nonincrease[i - 1] + 1;
            }
        }
        int[] nondecrease = new int[len];
        for(int i = len - 2; i >= k; i--) {
            if(nums[i] > nums[i + 1]) {
                nondecrease[i] = nondecrease[i + 1] != 0 ? nondecrease[i + 1] + 1 : 0;
            } else {
                nondecrease[i] = nondecrease[i + 1] + 1;
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < len; i++) {
            if(nonincrease[i] >= k && nondecrease[i] >= k) {
                list.add(i);
            }
        }
        return list;
    }
}
