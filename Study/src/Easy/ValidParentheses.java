package Easy;

public class ValidParentheses {

    /**
     *
     *     Example 1:
     *     Input: s = "()"
     *     Output: true
     *
     *     Example 2:
     *     Input: s = "()[]{}"
     *     Output: true
     *
     *     Example 3:
     *     Input: s = "(]"
     *     Output: false
     *
     * */

    String[] testS = {"()", "()[]{}", "(]", "([([](()))])",
                        "[[)", "([]{})", "({[][]})]", "([)]"};

    public boolean isValid01(String s) {
        System.out.println(s);
        String[] findBracket = {"()", "{}", "[]"};

        while (s.contains(findBracket[0]) || s.contains(findBracket[1]) || s.contains(findBracket[2]) ) {
            s = s.replace(findBracket[0], "");
            s = s.replace(findBracket[1], "");
            s = s.replace(findBracket[2], "");
        }
        if (s.length() == 0) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isValid02(String s) {
        System.out.println(s);
        int[] stack = new int[s.length()];
        int top = -1;
        for (char c : s.toCharArray()) {
            if (c == ')' || c == '}' || c == ']') {
                if (top != -1) {
                    if ((c == ')' && stack[top] == '(')
                            || (c == '}' && stack[top] == '{')
                            || (c == ']' && stack[top] == '[')) {
                        top--;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }

            // 여는 괄호일 때 스택에 넣는다.
            } else {
                stack[++top] = c;
            }
        }
        return top == -1;
    }

    public void methodTest() {
        for(String s : testS) {
            //System.out.println(isValid01(s));
            System.out.println(isValid02(s));
            System.out.println("=================");
        }
    }

}
