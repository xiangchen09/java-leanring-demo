package com.codility.test;

public class TapeEquilibrium {
    public int solution(int[] A) {
        int result = Integer.MAX_VALUE;
        for(int i = 1; i < A.length; i++) {
            result = Math.min(result, Math.abs(prefix(A, i) - suffix(A, i)));
        }
        return result;
    }

    private int prefix (int[] A, int index) {
        int prefixSum = 0;
        for(int i = 0; i < index; i++) {
            prefixSum += A[i];
        }
        return prefixSum;
    }

    private int suffix(int[] A, int index) {
        int suffixSum = 0;
        for (int i = index; i < A.length; i++) {
            suffixSum += A[i];
        }
        return suffixSum;
    }
}
