public class SqrtX {
    public static int mySqrt(int x) {
        int min = 1, max = x, ans = 0;
        while (max - min != 1) {
            int mid =(min + max) / 2;
            int test = mid * mid;
            if (test == x) {
                min = mid;
                return mid;
            } else if (test < x) {
                min = mid;
            } else {
                max = mid;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(9));
    }
}
