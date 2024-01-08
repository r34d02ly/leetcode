package funWithArrays;

public class Problem02 {
    public static void main(String[] args) {
        int[] nums1 = {12,345,2,6,7896};
        int[] nums2 = {555,901,482,1771};
        System.out.println("nums1 = " + findNumbers(nums1));
        System.out.println("nums2 = " + findNumbers(nums2));
    }

    public static int findNumbers(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            int d = 0;
            while (nums[i] > 0) {
                nums[i] = nums[i] / 10;
                d++;
            }
            if(d%2 == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}
