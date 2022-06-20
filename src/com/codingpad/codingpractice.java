package com.codingpad;

import java.util.*;

//Create a function that takes a word and returns true if the word has two consecutive identical letters.
//
//        Examples
//        doubleLetters("root") ➞ true
//
//        doubleLetters("dummy") ➞ true
//
//        doubleLetters("grand") ➞ false
//
//        doubleLetters("stable") ➞ false


public class codingpractice {

    public boolean checkConsecutive (String str) {
        if (str == null) {
            return false;
        }
        int n = str.length();
        for (int i = 0; i < n - 1 ; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        codingpractice cp = new codingpractice();
        String str = "dummy";
        System.out.println(cp.checkConsecutive(str));
    }

}
