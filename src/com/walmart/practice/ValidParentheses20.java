package com.walmart.practice;

import java.util.Stack;

public class ValidParentheses20 {
    public boolean isValid(String s) {
        Stack<Character> left = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                left.push(c);
            }
            else {
                if (!left.isEmpty() && leftOf(c) == left.peek()) {
                    left.pop();
                }
                else return false;
            }
        }
        return left.isEmpty();
    }

    public char leftOf(char c) {
        if (c == ')') return '(';
        if (c == '}') return '{';
        return '[';
    }


    public static void main(String[] args) {
        ValidParentheses20 vp = new ValidParentheses20();
        String s = "()[]{}";
        Boolean result = vp.isValid(s);
        System.out.println("result is: " + result);
    }
}
