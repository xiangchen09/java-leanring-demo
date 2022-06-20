package com.codility.test;
//        A non-empty array A consisting of N integers is given.
//        A permutation is a sequence containing each element from 1 to N once, and only once.
//        For example, array A such that:
//        A[0] = 4
//        A[1] = 1
//        A[2] = 3
//        A[3] = 2
//        is a permutation, but array A such that:
//
//        A[0] = 4
//        A[1] = 1
//        A[2] = 3
//        is not a permutation, because value 2 is missing.
//
//        The goal is to check whether array A is a permutation.
//
//        Write a function:
//        class Solution { public int solution(int[] A); }
//        that, given an array A, returns 1 if array A is a permutation and 0 if it is not.
//[4, 1, 3, 2] -> [null, null, null, null] -> [1, 1, 1, 1]
public class PermCheck {
    public int solution(int[] A) {
        int[] count = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            if (A[i] < 1 || A[i] > A.length) {
                return 0;
            } else if (count[A[i] - 1] == 1) {
                return 0;
            } else {
                count[A[i] - 1 ] = 1;
            }
        }
        return 1;
    }
}
