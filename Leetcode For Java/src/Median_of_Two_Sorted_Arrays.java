import java.util.ArrayList;
import java.util.Arrays;

public class Median_of_Two_Sorted_Arrays {

        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int index1 = 0;
            int index2 = 0;
            int mid1 = 0;
            int mid2 = 0;
            for(int i = 0; i <= (nums1.length + nums2.length) / 2; i++) {
                mid1 = mid2;
                if(index1 == nums1.length) {
                    mid2 = nums2[index2];
                    index2++;
                } else if(index2 == nums2.length) {
                    mid1 = nums1[index1];
                    index1++;
                } else {
                    //if there exis element in both array
                    if(nums1[index1] < nums2[index2]) {
                        mid2 = nums1[index1];
                        index1++;
                    } else {
                        mid2 = nums2[index2];
                        index2++;
                    }
                }
            }

            if((nums1.length + nums2.length) % 2 == 0) {
                return (float) (mid1 + mid2) / 2;
            }
            return mid2;
        }
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{2}, new int[]{}));
    }
}
