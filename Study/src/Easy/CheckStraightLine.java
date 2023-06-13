package Easy;

import java.util.Arrays;

public class CheckStraightLine {

    /**
     *
     *  Example 1:
     *  Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
     *  Output: true
     *
     *  Example 2:
     *  Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
     *  Output: false
     *
     * */

    int[][] testcase1 = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
    int[][] testcase2 = {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};

    public boolean checkStraightLine(int[][] coordinates) {
        float gradient = 0;
        int[] dot1 = coordinates[0];
        int[] dot2 = coordinates[1];
        gradient = (dot1[0] - dot2[0]) / (dot1[1] - dot2[0]);
        return false;
    }

    public void methodTest() {
        System.out.println(checkStraightLine(testcase1));
        System.out.println(checkStraightLine(testcase2));
    }
}
