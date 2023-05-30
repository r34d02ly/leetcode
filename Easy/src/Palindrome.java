public class Palindrome {

    /**
     *     Example 1:
     *     Input: x = 121
     *     Output: true
     *     Explanation: 121 reads as 121 from left to right and from right to left.
     *
     *     Example 2:
     *     Input: x = -121
     *     Output: false
     *     Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
     *                  Therefore it is not a palindrome.
     *
     *     Example 3:
     *     Input: x = 10
     *     Output: false
     *     Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
     *
     * */

    int[] xs = {121, -121, 10, 65468, 45654, -9846984, -78987, 100, 10101, 101010, 456787654};

    public boolean isPalindrome01(int x) {
        int reverse = 0;
        int temp = x;
        if(x < 0) {
            return false;
        } else if(x < 10) {
            return true;
        } else {
            while(temp!=0){
                reverse = reverse*10 + temp%10;
                temp /= 10;
                System.out.println("reverse : " +String.valueOf(reverse) +", temp : " +String.valueOf(temp));
            }
            return reverse == x;
        }
    }

    public  void methodTest() {
        for(int x : xs) {
            System.out.println(isPalindrome01(x));
        }
    }
}
