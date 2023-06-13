package Easy;

public class RichestCustomerWealth {

    int[][] testA = {
            {1,5},
            {7,3},
            {3,5}
    };

    public int maximumWealth01(int[][] accounts) {
        int max = 0;
        for(int[] i : accounts) {
            int temp = 0;
            for(int j = 0; j < i.length; j++) {
                temp += i[j];
            }
            if(temp > max) {
                max = temp;
            }
        }
        return max;
    }

    public void methodTest() {
        System.out.println(maximumWealth01(testA));
    }

}
