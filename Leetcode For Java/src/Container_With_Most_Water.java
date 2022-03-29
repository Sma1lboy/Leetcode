public class Container_With_Most_Water {
    public static int maxArea(int[] height) {
        int max = 0;
        int temp = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            if (height[i] <= height[j]) {
                temp = height[i] * (j - i);
                i++;
            } else {
                temp = height[j] * (j - i);
                j--;
            }
            if (temp > max) max = temp;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(arr));
    }
}
