//35
public class Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]){
                return i;
            }
            temp = i;
        }
        return temp + 1;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{2, 3, 4}, 5));
    }
}
