public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
        public int[] searchRange(int[] nums, int target) {
            int start = 0, end = nums.length - 1, mid = 0;
            int[] ans = {-1, -1};
            while(start <= end) {
                mid = start + (end - start) / 2;
                if(nums[mid] == target) {
                    ans[0] = mid;
                    end = mid - 1;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            if(ans[0] == -1) {
                return ans;
            }
            start = ans[0];
            end = nums.length - 1;
            while(start <= end) {
                mid = start + (end - start) / 2;
                if(nums[mid] == target) {
                    ans[1] = mid;
                    start = mid + 1;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return ans;
        }

}
