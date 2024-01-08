package funWithArrays;

public class Problem01 {
    public static void main(String[] args) {
        int[] nums1 = {1,1,0,1,1,1};
        int[] nums2 = {1,0,1,1,0,1};
        System.out.println(Problem01.findMaxConsecutiveOnes(nums1));
        System.out.println(Problem01.findMaxConsecutiveOnes(nums2));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int cntI = 0;
        int maxI = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                ++cntI;
            } else {
                if(cntI > maxI) {
                    maxI = cntI;
                }
                cntI = 0;
            }
        }
        if(cntI > maxI) {
            maxI = cntI;
        }
        return maxI;
    }
}
