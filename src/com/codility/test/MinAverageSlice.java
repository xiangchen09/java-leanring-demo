package com.codility.test;
//[4, 2, 2, 5, 1, 5, 8]  index A[P] + ... + A[Q] / Q - P + 1, find the minimal average, return index P
//区间和平均值 = 区间和 / 区间元素个数， 找到最小平均值，返回区间起始index
public class MinAverageSlice {
    class Solution {
        public int solution(int[] A) {
            int result = 0;
            int N = A.length;
            int[] prefix = new int[N + 1];
            prefix[0] = A[0];
            for(int i = 1; i < prefix.length; i++) {
                prefix[i] = prefix[i - 1] + A[i - 1];
            }

            double average = Double.MAX_VALUE;
            for (int P = 0; P < N - 1; P++) {
                for (int Q = P + 1; Q < N; Q++) {
                    //A[P] + ... A[Q] == prefix[Q + 1] - prefix[P]
                    double temp = (double) (prefix[Q + 1] - prefix[P]) /(double) (Q - P + 1);
                    if (temp < average) {
                        average = temp;
                        result = P;
                    }
                }
            }
            return result;
        }
    }
}
