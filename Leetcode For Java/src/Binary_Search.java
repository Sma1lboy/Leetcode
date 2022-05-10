//704 Binary Search
public class Binary_Search {
    public static int search(int[] nums, int target) {
        int index = -1;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] == target) {
                index = mid;
                return mid;
            }
            else if(target < nums[mid]) {
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};

        System.out.println(search(arr, 11));
    }
}
