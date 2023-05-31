package Easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     *         Example 1:
     *         Input: nums = [2,7,11,15], target = 9
     *         Output: [0,1]
     *         Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     *
     *         Example 2:
     *         Input: nums = [3,2,4], target = 6
     *         Output: [1,2]
     *
     *         Example 3:
     *         Input: nums = [3,3], target = 6
     *         Output: [0,1]
     **/

    /**
     * test case
     * */
    int[][] testNumbers = {{2,7,11,15},
                            {3,2,4},
                            {3,3},
                            {-5,-23, 10,15},
                            {12,76,11,35,56,199,115},
                            {1,2,5,7,111,615,-1025,548,126,895,1265,665,323,4596,15,88,75} };
    int[] testTarget = {9, 6, 6 ,-8, 44, 163};


    // Solution 1
    public int[] twoSum01(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for(int j = (i+1); j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

    // Solution 2
    // 3,2,4 : 6
    // 6-3 이 되는 값
    // 6-2 가 되는 값 -> 4
    public int[] twoSum02(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return new int[]{};
    }


    public void methodTest() throws InterruptedException {

        // 테스트 케이스만큼 시도하기
        for(int a = 0; a<testNumbers.length; a++) {

            /*
            // Solution 1
            int[] result01 = twoSum01(testNumbers[a], testTarget[a]);
            String[] resultStr01 = new String[result01.length];
            for(int i = 0; i < resultStr01.length; i++) {
                resultStr01[i] = String.valueOf(result01[i]);
            }
            System.out.println("[" +String.join(",", resultStr01) +"]");
            */

            // Solution 2
            int[] result02 = twoSum02(testNumbers[a], testTarget[a]);
            String[] resultStr02 = new String[result02.length];
            for(int i = 0; i < resultStr02.length; i++) {
                resultStr02[i] = String.valueOf(result02[i]);
            }
            System.out.println("[" +String.join(",", resultStr02) +"]");

        }

    }

}
