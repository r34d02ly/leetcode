package funWithArrays;

import java.util.Arrays;

public class Problem03 {
    public static void main(String[] args) {
        int[] nums1 = {-4,-1,0,3,10};
        int[] nums2 = {-7,-3,2,3,11};
        System.out.println(sortedSquares(nums1).toString());
        System.out.println(sortedSquares(nums2).toString());
    }

    public static int[] sortedSquares(int[] nums) {
        int[] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i] * nums[i];
        }

        Arrays.sort(newNums);
        return newNums;
    }
}
