package Easy;

public class RunningSumArray {

    int[][] testA = {{1,2,3,4},
                    {1,1,1,1,1},
                    {3,1,2,10,1}
                    };

    public int[] runningSum01(int[] nums) {
        int[] rtn = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            if(i != 0) {
                rtn[i] = rtn[i - 1] + nums[i];

            } else {
                rtn[i] = nums[i];
            }
            System.out.println(String.valueOf(rtn[i]));
        }

        return rtn;
    }

    public int[] runningSum02(int[] nums) {
        for(int i = 1; i<nums.length; i++) {
            nums[i] = nums[i-1] + nums[i];
            System.out.println(String.valueOf(nums[i]));
        }
        return nums;
    }

    public void methodTest() {
        for(int[] i : testA) {
            System.out.println(runningSum02(i));
            System.out.println("=================");
        }
    }
}
