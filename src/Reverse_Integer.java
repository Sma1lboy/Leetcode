import static java.lang.Long.reverse;

public class Reverse_Integer {
        public static int reverse(int x) {
            long res = 0;
            for (; x != 0; x /= 10)
                res = res * 10 + x % 10;
            return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0: (int) res;
        }



    public static void main(String[] args) {
        System.out.println(reverse(12));
    }
}
