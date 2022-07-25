public class Koko_eating_banana {

        //thinking: the koko eating speed is in range[loi, highi]
        public static int minEatingSpeed(int[] piles, int h) {
            //k range [loi, highi]
            int lo = 1;
            int high = getMax(piles);
            while(lo <= high) {
                int currSpeed = lo + (high - lo) / 2;
                //if we could finish eat the banana during current time
                //we want to get the k smaller, so we are going to try the mid - 1 one
                if(eatAll(piles, currSpeed, h)) {
                    high = currSpeed - 1;
                } else {
                    lo = currSpeed + 1;
                }
            }
            return lo;

        }
        public static boolean eatAll(int[] piles, int speed, int guardHours) {
            long hours = 0;
            for(int pile : piles) {
                hours += pile % speed != 0 ? pile / speed + 1 : pile / speed;
            }
            return hours <= guardHours;
        }
        public static int getMax(int[] nums) {
            int max = Integer.MIN_VALUE;
            for(int num : nums) {
                max = Math.max(num, max);
            }
            return max;
        }
    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[]{805306368,805306368,805306368},1000000000));

    }

}
