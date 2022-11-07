public class Search_in_Rotated_Sorted_Array {

        public static int search(int[] nums, int target) {
            //find the pivot index of rotation
            int n = nums.length;
            int left = 0, right = n - 1;
            while(left <= right ) {
                int mid = left + (right - left) / 2;
                if(nums[mid] > nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid-1;
                }
            }
            int rot = left;
            // int rot = n - pivot;
            left = 0;
            right = n - 1;
            while(left <= right) {
                int fakeMid = left + (right - left) / 2;
                int realMid = (fakeMid + rot) % n;
                if(nums[realMid] == target) {
                    return realMid;
                } else if(nums[realMid] < target) {
                    left = fakeMid + 1;
                } else if(nums[realMid] > target) {
                    right = fakeMid - 1;
                }
            }
            return -1;
        }



    public static void main(String[] args) {
        System.out.println(search(new int[]{3,5,1}, 5));
    }

}
