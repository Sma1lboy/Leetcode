public class Non_decreasing_Array {
    public static boolean checkPossibility(int[] nums) {
        int count = 0;
        //greed algorithm
        for(int i = 1; i < nums.length; i++) {
            if(nums[i-1] > nums[i]){
                count++;
                 if(i < 2 ||nums[i-2] <= nums[i]) {
                     nums[i - 1] = nums[i];
                 }else {
                     nums[i] = nums[i - 1];
                 }
            }


        }
        return count <=1;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,2,3};
        boolean a = checkPossibility(nums);
        System.out.println(a);
    }
}
