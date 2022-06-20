package com.walmart.practice;

import java.util.HashSet;
import java.util.Set;

public class MissingNumbers {
    public int missingNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int num: nums) {
            numSet.add(num);
        }

        int expectedNumCount = nums.length + 1;
        for (int i = 0; i < expectedNumCount; i++) {
            if (!numSet.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    public int missingNumber2(int[] nums) {
        //any num ^ num = 0, so we can add the original length of num, then XOR with all index;
        int n = nums.length;
        int res = 0;
        res ^= n;
        for (int i = 0; i < n; i++) {
            res ^= i ^ nums[i];
        }
        return res;
    }

}
