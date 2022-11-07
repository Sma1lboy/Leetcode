/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/6
 */
public class Minimum_Health_to_Beat_Game {
    public static void main(String[] args) {
        minimumHealth(new int[]{2,7,4,3}, 4);
    }

    public static long minimumHealth(int[] A, int armor) {
        int sum = 0;
        int closeArmorDamage = Integer.MAX_VALUE;
        int indexArmorDamage = -1;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (closeArmorDamage > Math.abs(armor - A[i])) {
                closeArmorDamage = Math.abs(armor - A[i]);
                indexArmorDamage = i;
            }
        }
        int i = sum - A[indexArmorDamage];
        return i;
    }
}
