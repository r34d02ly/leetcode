package Easy;

import java.util.Arrays;
import java.util.Stack;

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
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            //만약 여는 태그면 스택에 일단 넣음
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                // 닫는 태그인 상황에서 비교해야 되는데 비어있으면 탈락
                if(stack.isEmpty()) {
                    return false;
                }
                // 짝 맞는거 나올때마다 스택에서 꺼냄
                if(stack.peek() == '(' && c == ')' ) {
                    stack.pop();
                } else if(stack.peek() == '[' && c == ']' ) {
                    stack.pop();
                } else if(stack.peek() == '[' && c == ']' ) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        // 문자열 다 돌고 나서 스택이 비어있는지 체크해서 리턴
        return stack.isEmpty();
    }

    public boolean isValid03(String s) {
        System.out.println(s);
        int[] stack = new int[s.length()];
        int top = 0;
        for (char c : s.toCharArray()) {
            // 여는 괄호일 때마다 스택에 넣는다.
            if (c == '(' || c == '[' || c == '{') {
                stack[++top] = c;
            } else {
                // 닫는 태그인 상황에서 비교해야 되는데 비어있으면 탈락
                if (top == 0) {
                    return false;
                } else {
                    // 짝 맞는거 나올때마다 스택에서 꺼냄
                    if ((c == ')' && stack[top] == '(')
                            || (c == '}' && stack[top] == '{')
                            || (c == ']' && stack[top] == '[')) {
                        top--;
                    } else {
                        return false;
                    }
                }
            }
        }
        return top == 0;
    }

    public void methodTest() {
        for(String s : testS) {
            //System.out.println(isValid01(s));
            //System.out.println(isValid02(s));
            System.out.println(isValid03(s));
            System.out.println("=================");
        }
    }

}
