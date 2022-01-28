//1281n 
public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {

    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n != 0) {
//          FIXME 243
            int rem = n % 10;
            product *= rem;
            sum += rem;
            n /= 10;
        }

        return product - sum;
    }

    public static void main(String[] args) {

    }
}
