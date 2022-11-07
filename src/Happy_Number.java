//Two point fast and slow pointer.
public class Happy_Number {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do {
            slow = squreNum(slow);
            fast = squreNum(squreNum(fast));
        } while (fast != slow);
        if(slow == 1) return true;
        return false;

    }
    public int squreNum(int n) {
        int sum = 0;
        while(n > 0) {
            int rmd=  n % 10;
            sum = rmd * rmd + sum;
            n /= 10;
        }
        return sum;
    }
}
