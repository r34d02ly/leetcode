import java.util.Arrays;

public class LongestCommonPrefix {

    /**
     *
     *     Example 1:
     *     Input: strs = ["flower","flow","flight"]
     *     Output: "fl"
     *
     *     Example 2:
     *     Input: strs = ["dog","racecar","car"]
     *     Output: ""
     *     Explanation: There is no common prefix among the input strings.
     * */

    String[][] testS = {{"flower","flow","flight"},
                        {"dog","racecar","car"},
                        {"asdfsdfsdf","asdfwerghthr","asdgoiwoji","asdfioxnqls"},
                        {"cnsklmso", "snmowon","qioqpq"}};

    public String longestCommonPrefix01(String[] strs) {

        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        String rtn = "";

        int i = 0;
        while (i < s1.length() && i < s2.length()) {
            if(s1.charAt(i) == s2.charAt(i)) {
                i++;
            } else {
                break;
            }
        }
        rtn = s1.substring(0, i);
        return rtn;
    }

    public void methodTest() {
        for(String[] s : testS) {
            System.out.println(longestCommonPrefix01(s));
            System.out.println("=================");
        }
    }
}
