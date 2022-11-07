import java.util.Arrays;

public class PartitioArray_Into_Two_Arrays_to_Minimize_Sum_Difference {
//    //first half  2^15 >= i, x
//    //last half j = n - i
//    // x + y = sum - (x + y)  +> 2x +2y = sum => y = sum/2-x
    public static int minimumDifference(int[] nums) {
        int n = nums.length;
        //initial each number and the possible combo
        int[][] firstList = helper(Arrays.copyOfRange(nums, 0 , n / 2));
        int[][] lastList = helper(Arrays.copyOfRange(nums, n/2 , n));
        //after we find possible combo
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i < n / 2; i++){
            int[] first = firstList[i];
            int[] last = lastList[i];
            //using two pointer to find element in first half and last half
            int p1 = 0, p2 = 0;
            //the length of first arr and last array should equal
            int tmpLeng =  first.length;
            while(p1 < tmpLeng && p2 < tmpLeng) {
                int diff = first[p1] - last[p2];
                minDiff = Math.min(Math.abs(diff), minDiff);
                if(diff >= 0) {
                    p2++;
                } else {
                    p1++;
                }
            }

        }


        return minDiff;
    }

    private static int[][] helper(int[] nums) {
        int n = nums.length;
        //get the total number with this arraa
        int total = 0;
        for(int num : nums){ total+=num;}

        //the n + 1 for length because the length of the list could be zero
        int[][] res = new int[n + 1][];

        int combo = 1;
        //at length 0, there is only one possible outcomes
        res[0] = new int[combo];
        //calc how many number there we have  when len is i, and initialize the int[][]
        for(int i = 1; i <= n; i++) {
            combo = combo * (n - i + 1) / i;
            res[i] = new int[combo];
        }

        int ansSize = 1 << n;
        int[] counter = new int[n + 1]; //used to keep the current index for each length
        for (int i = 0; i < ansSize; i++) {
            int subSum = 0;
            for (int j = 0; j < n; j++) {
                if ((i >> j & 1) == 1) {
                    subSum += nums[j];
                }
            }

            int rest = total - subSum;  
            int lenOfSub = Integer.bitCount(i);
            res[lenOfSub][counter[lenOfSub]++] = subSum - rest;
        }

        for (int[] a : res) {
            Arrays.sort(a);
        }

        return res;

    }



//        public static int minimumDifference(int[] nums) {
//
//            //size of the arrays
//            int size=nums.length/2;
//
//            //totalsum
//            int totalSum=0;
//
//            //add up to cauculate sum
//            for(int i=0;i<nums.length;i++){
//                totalSum+=nums[i];
//            }
//            int[]midiff=new int[1];
//            midiff[0]=Integer.MAX_VALUE;
//            int level=nums.length;
//
//            helper(totalSum,size,0,midiff,level,0,nums,0);
//            return midiff[0];
//
//        }
//        //                    3 9 7 3    totalsum 22
//        //                     add               or not add
//        // index 0            [3]                         []
//        //          one soultion
//        //index 1      [3 9]         [3]           [3]           []
//        //
//        //index 2  [dont need] []   [3,7] [3]      [3 7]  [3]      [7]  []
//        //
//        //
//        //
//        //
//
//        public static void helper(int totalSum,int size,int index,int[]midiff,int level,int leftLength,int[]nums,int sum){
//            if(leftLength==size){
//                midiff[0]=Math.min(midiff[0],Math.abs(sum-(totalSum-sum)));
//
//                return;
//            }
//            if(index==level){
//
//                return;
//            }
//            //go over
//            helper(totalSum,size,index+1,midiff,level,leftLength+1,nums,sum+nums[index]);
//
//
//
//            // go back
//            helper(totalSum,size,index+1,midiff,level,leftLength,nums,sum);
//
//        }







    public static void main(String[] args) {
        int nums[] = {7772197,4460211,-7641449,-8856364,546755,-3673029,527497,-9392076,3130315,-5309187,-4781283,5919119,3093450,1132720,6380128,-3954678,-1651499,-7944388,-3056827,1610628,7711173,6595873,302974,7656726,-2572679,0,2121026,-5743797,-8897395,-9699694};
        System.out.println(minimumDifference(nums));

    }
}
