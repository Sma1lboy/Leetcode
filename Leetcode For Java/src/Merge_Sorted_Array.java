public class Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n -1;
        int p3 = m + n - 1;
        while(p3 >= 0) {
            if(p1 < 0) {
                nums1[p3--] = nums2[p2--];
            } else if (p2 < 0) {
                nums1[p3--] = nums1[p1--];
            } else {
                if(nums1[p1] >= nums2[p2]) {
                    nums1[p3--] = nums1[p1--];
                } else {
                    nums1[p3--] = nums2[p2--];
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m =3;
        int n = 3;
        merge(nums1, 3,nums2,3);
    }
}
