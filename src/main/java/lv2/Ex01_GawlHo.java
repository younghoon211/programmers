package programmers_lv2;

import java.util.Stack;

// 올바른 괄호
public class Ex01_GawlHo {

    public static void main(String[] args) {
        System.out.println(solution("()()"));
    }

    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (s.charAt(i) == ')') {
                // 비어있으면: 앞에 (가 없다는 의미이니 올바른 괄호x
                if (stack.isEmpty()) {
                    return false;
                }
                // 앞에 맞는 ( 짝이 있다면 스택 비우기
                stack.pop();
            }

        }

        return stack.isEmpty();
    }

    // charAt(i)
    // i번째 문자 반환

}
