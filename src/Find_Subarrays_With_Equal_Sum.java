/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/3
 */
public class Find_Subarrays_With_Equal_Sum {
    public boolean findSubarrays(int[] nums) {
        return false;
    }

    public static long asBaseNum(int num, int base) {
        long ret = 0, factor = 1;
        while (num > 0) {
            ret += num % base * factor;
            num /= base;
            factor *= 10;
        }
        return ret;
    }

    public static void main(String[] args) {
        long l = asBaseNum(9, 3);
        System.out.println(l);

    }
}
