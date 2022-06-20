package com.codility.test;

//关键在于Integer到BinaryString的转换

public class BinaryGap {
    public int solution(int N) {
        String binaryStringOfN = Integer.toBinaryString(N);
        int left = 0;
        int result = 0;

        for (int i = 1; i < binaryStringOfN.length(); i++) {
            char currentChar = binaryStringOfN.charAt(i);
            if (currentChar == '1') {
                result = Math.max(result, i - left - 1);
                left = i;
            }
        }
        return result;
    }
}
