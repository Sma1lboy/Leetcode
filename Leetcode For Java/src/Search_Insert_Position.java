//35
public class Search_Insert_Position {
//    public static int searchInsert(int[] nums, int target) {
//        int temp = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (target <= nums[i]){
//                return i;
//            }
//            temp = i;
//        }
//        return temp + 1;
//    }
public static int searchInsert(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    int mid = 0;
    while(left <= right) {
        mid = left + (right - left ) / 2;
        if(nums[mid] == target) {
            return mid;
        }else if ( target < nums[mid]) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    return right + 1;
}

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{2, 3, 4}, 5));
    }
}
