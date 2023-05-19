package stack;

import java.util.Scanner;

public class ParenthesesMatching {
    static Stack<Character> stack = new Stack<>();
    public static void main(String[] args) throws StackUnderflow {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter input: ");
        String input = scn.nextLine();

        for(int i = 0; i < input.length(); i++) {
            char curr = input.charAt(i);
            if(curr == '(' ||
                curr == '[' ||
                    curr == '{'
            ) {
                stack.push(curr);
            } else if (curr == ')' ||
                    curr == ']' ||
                    curr == '}'
            ) {
                if (stack.isEmpty()) {
                    System.out.println("The input is unbalance");
                    System.exit(0);
                } else if (isMatch(curr)) {
                    stack.pop();
                }
                else {
                    System.out.println("The input is mismatched");
                    System.exit(0);
                }
            }
        }
        System.out.println("The input is correct");
    } // end main

    private static boolean isMatch(char c) throws StackUnderflow {
        if (c == ')') {
            return stack.peek() == '(';
        } else if (c == ']') {
            return stack.peek() == '[';
        } else if (c == '}') {
            return stack.peek() == '{';
        } else {
            return false;
        }
    }
}