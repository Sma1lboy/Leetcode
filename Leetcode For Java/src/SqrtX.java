public class SqrtX {
    public static int mySqrt(int x) {
        int start = 0;
        int end = x;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start ) / 2;
            long sqr = (long) mid * mid;
            if (sqr == x) {
                return mid;
            } else if (sqr < x) {

                start = mid + 1;
            } else if (sqr > x) {
                end = mid - 1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(9));
    }
}
