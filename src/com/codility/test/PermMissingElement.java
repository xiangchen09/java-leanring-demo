package com.codility.test;

import java.util.HashSet;
import java.util.Set;

public class PermMissingElement {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for(int num: A) {
            set.add(num);
        }
        for (int i = 1; i < A.length + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}
