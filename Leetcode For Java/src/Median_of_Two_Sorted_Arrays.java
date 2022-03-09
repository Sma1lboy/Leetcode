import java.util.ArrayList;
import java.util.Arrays;

public class Median_of_Two_Sorted_Arrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] combArr = new int[nums1.length + nums2.length];
        double median = -1;
        int index = 0;
        for(int i = 0; i < nums1.length; i++) {
            combArr[i] = nums1[index];
            index++;
        }
        index = 0;
        for(int i = nums1.length; i < (nums1.length + nums2.length); i++) {
            combArr[i] = nums2[index];
            index++;
        }
        Arrays.sort(combArr);
        if(combArr.length % 2 != 0) {
            median = (double) combArr[combArr.length / 2];
        }
        else  {
            median = (double)(combArr[combArr.length/2] + combArr[(combArr.length/2) - 1]) /2;
        }
        return median;
    }

    public static void main(String[] args) {
        int[] num1 = {1,2};
        int[] num2 = {3,4};
        System.out.println(findMedianSortedArrays(num1, num2));
    }
}
