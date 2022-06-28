public class Next_Permutation {
    public void nextPermutation(int[] nums) {
        //find pivot by using indexOfLastPeak, and the pivot is the index of peak left shift one
        //pivotIndex
        int pivotIndex = indexOfLastPeak(nums) - 1;
        //check if we found the pivot
        if(pivotIndex != -1) {
            //we have find right most value to pivot in suffuix
            int nextSwap = lastIndexOfGreater(nums, pivotIndex);
            swap(nums, pivotIndex, nextSwap);
        }
        reverseSuffix(nums, pivotIndex+1);

    }

    public int indexOfLastPeak(int[] nums) {
        //we want to find last non decreasing array
        for(int i = nums.length - 1; i>0;i--) {
            if(nums[i] > nums[i - 1]) {
                return i;
            }
        }
        //if doesnt have it return 0
        return 0;
    }
    public int lastIndexOfGreater(int[] nums, int pivotIndex) {
        //find the first righmost value that greater than pivot value
        for(int i = nums.length - 1; i>pivotIndex; i--) {
            if(nums[i] > nums[pivotIndex]) {
                return i;
            }
        }
        //if not return -1
        return -1;
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverseSuffix(int[] nums, int start) {
        int end = nums.length - 1;
        while(start <= end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
