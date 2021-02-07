package stack;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesesChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String parentheses = "({[]})";

        checker(parentheses);

    }

    static void checker(String s) {

        Stack stack = new Stack();

        boolean isBalance = false;

        for(int j = 0; j < s.length(); j++) {

            for (int i = 0; i < s.length(); i++) {

                char c = s.charAt(i);

                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                }

                if (c == ')' || c == '}' || c == ']') {

                    if (c == (char)stack.peek()) {
                        stack.pop();
                    }

                }

            }
        }
        System.out.println(stack);

    }
}
