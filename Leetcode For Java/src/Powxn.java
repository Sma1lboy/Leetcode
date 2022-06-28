public class Powxn {
    public double myPow(double x, int n) {
        //if x equals 0, we dont have to do the recursion
        if(x == 0) {
            return 0;
        }
        //if n equals 0, we return 1
        if(n == 0) return 1;
        //if n == min_value, we x
        if(n == Integer.MIN_VALUE){
            x = x * x;
            n = n/2;
        }
        //if n < 0.  because x^-n = 1/(x^n)
        if(n < 0) {
            n = -n;
            x = 1/x;
        }

        return (n%2 == 0) ? myPow(x * x, n/2) : x *  myPow(x * x, n/2);
    }
}
