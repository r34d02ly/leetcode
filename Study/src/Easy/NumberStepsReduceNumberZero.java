package Easy;

public class NumberStepsReduceNumberZero {

    int[] testN = {14, 8, 123,60, 77};

    public int numberOfSteps01(int num) {
        int cnt = 0;
        while(num != 0) {
            if(num%2 == 0) {
                num = num / 2;
                cnt++;
            } else {
                num -= 1;
                cnt++;
            }
        }
        return cnt;

    }

    public int numberOfSteps02(int num) {
        int cnt = 0;
        while(num != 0) {
            // 짝수
            if((num&1) == 0) {
                num >>= 1;
                cnt++;
            // 홀수
            } else {
                num--;
                cnt++;
            }
        }
        return cnt;
    }

    public void methodTest() {
        for(int i : testN) {
            System.out.println(numberOfSteps01(i));
            System.out.println("=================");
        }
    }
}
