package funWithArrays;

public class Problem05 {
    public static void main(String[] args) {
        /*
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        */
        /*
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0;
        int n = 1;
        */

        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int[] nums2 = {1, 2, 3};
        int m = 3;
        int n = 3;

        /*
        int[] nums1 = {-1,0,0,3,3,3,0,0,0};
        int m = 6;
        int[] nums2 = {1,2,2};
        int n = 3;
        */
        merge(nums1, m, nums2, n);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int n1 = m-1;
        int n2 = n-1;
        int p = nums1.length-1;

        while (n2 >= 0) {
            if(n1 >= 0 && nums1[n1] > nums2[n2]) {
                nums1[p] = nums1[n1];
                n1--;
            } else {
                nums1[p] = nums2[n2];
                n2--;
            }
            p--;
        }

    }
}
