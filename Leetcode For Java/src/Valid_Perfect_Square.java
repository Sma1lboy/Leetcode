public class Valid_Perfect_Square {
    public boolean isPerfectSquare(int num) {
        if(num == 1) {
            return true;
        }
        int lowEnough = 1;
        int tooHigh = num;
        long mid = 0;
        while(lowEnough <= tooHigh) {
            mid = lowEnough + (tooHigh - lowEnough) / 2;
            long sqre = mid * mid;
            if(sqre  == num) {
                return true;
            } else if (num < sqre) {
                tooHigh = (int)mid - 1;
            } else if (num > sqre) {
                lowEnough = (int)mid + 1;
            }
        }
        return false;
    }
}
