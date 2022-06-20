package com.codility.test;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrenceInArray {
    public int solution(int[] A) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            count.put(A[i], count.getOrDefault(A[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry: count.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
