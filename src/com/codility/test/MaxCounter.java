package com.codility.test;

import java.util.Arrays;

public class MaxCounter {
    public int[] solution(int N, int[] A) {
        int[] result = new int[N];
        Arrays.fill(result, 0);
        int max = 0;

        for (int i = 0; i < A.length; i++) {
            if(A[i] == N + 1) {
                Arrays.fill(result, max);
            }
            else {
                result[A[i] - 1] += 1;
                if (result[A[i] - 1] > max) {
                    max = result[A[i] - 1];
                }
            }
        }
        return result;
    }
}
