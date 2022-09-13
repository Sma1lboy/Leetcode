import java.util.Arrays;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/9
 */
public class The_Number_of_Weak_Characters_in_the_Game {
    public static void main(String[] args) {
        numberOfWeakCharacters(new int[][]{{1,1}, {2,1}, {2,2}, {1,2}});
    }

    public static int numberOfWeakCharacters(int[][] properties) {
        int n = properties.length;
        int count = 0;

        Arrays.sort(properties, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (properties[i][1] < max) {
                count++;
            }
            max = Math.max(properties[i][1], max);
        }
        return count;
    }
}
