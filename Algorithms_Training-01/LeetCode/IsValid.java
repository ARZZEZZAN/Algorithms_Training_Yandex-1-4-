package LeetCode;

import java.util.HashMap;
import java.util.Stack;

public class IsValid {

    public static void main(String[] args) {
        System.out.println(isValid("["));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()
                        || ch == ')' && stack.pop() != '('
                        || ch == '}' && stack.pop() != '{'
                        || ch == ']' &&stack.pop() != '['
                ) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
