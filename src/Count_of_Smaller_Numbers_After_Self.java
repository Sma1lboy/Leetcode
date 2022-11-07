import java.util.ArrayList;
import java.util.List;

public class Count_of_Smaller_Numbers_After_Self {

        static class Pair{
            int val;
            int originIndex;
            Pair(int val, int index) {
                this.val = val;
                this.originIndex = index;
            }
        }
        public static List<Integer> countSmaller(int[] nums) {
            int n = nums.length;
            int[] result = new int[n];
            Pair[] newNums = new Pair[n];
            for(int i = 0; i < n; i++) {
                newNums[i] = new Pair(nums[i], i);
            }
            //merge the new sort
            mergeSort(newNums, 0, n - 1, result);
            List<Integer> resList = new ArrayList<>();
            for(int i : result) {
                resList.add(i);
            }
            return resList;
        }
        public static void mergeSort(Pair[] nums, int start, int end, int[] result) {

            //merge recursion to the single sub
            if(start >= end ) {
                return;
            }
            int mid = start + (end - start) / 2;
            mergeSort(nums, start, mid, result);
            mergeSort(nums, mid + 1, end, result);

            //build merge area
            List<Pair> merge = new ArrayList<>();
            //left sub pos and right sub pos
            int leftPos = start;
            int rightPos = mid + 1;
            int numsLessThanLeft = 0;
            //go through both left sub and right sub
            while(leftPos < mid + 1 && rightPos <= end) {
                //if left val greater than right
                if(nums[leftPos].val > nums[rightPos].val) {
                    numsLessThanLeft++;
                    //add smaller one into merge area
                    merge.add(nums[rightPos]);
                    rightPos++;
                } else {
                    //is left val smaller than right, add all right number count which already passed
                    //into merge area
                    result[nums[leftPos].originIndex] += numsLessThanLeft;
                    merge.add(nums[leftPos]);
                    leftPos++;
                }
            }

            //check if left or right sub still has remain
            while(leftPos < mid + 1) {
                result[nums[leftPos].originIndex] += numsLessThanLeft;
                merge.add(nums[leftPos]);
                leftPos++;
            }
            while(rightPos <= end) {
                merge.add(nums[rightPos]);
                rightPos++;
            }

            //not input our merge area into out nums array
            int pos = start;
            for(Pair n : merge) {
                nums[pos] = n;
                pos++;
            }


        }

    public static void main(String[] args) {
        countSmaller(new int[]{5,2,6,1});
    }


}
