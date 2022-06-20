package com.walmart.practice;

public class ValidPalindrome125 {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        s = s.toLowerCase();
        int n = s.length();
        int left = 0, right = n - 1;
        char[] chars = s.toCharArray();
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(chars[left])) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(chars[right])) {
                right--;
            }
            if (chars[left++] != chars[right--]) {
                return false;
            }
        }
        return true;
    }
}
