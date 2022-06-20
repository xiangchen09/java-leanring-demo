package com.codility.test;

//given a list of integer, group them by the sum of the digits, calculate the sum of max 2 elements.
//        eg: 51, 24, 42  are a group because 5+1 == 4+2 == 2+4
//        the sum of max 2 elements for this group is 51+42 = 93.
//        Calculate for each group and get the max from all groups.


import java.util.*;

public class MaxGroupSum {
    public List<Integer> maxGroupSum(int[] nums) {
        HashMap<Integer, List<Integer>> group = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (group.containsKey(getDigitSum(nums[i]))) {
                group.get(getDigitSum(nums[i])).add(nums[i]);
            } else {
                List<Integer> groupedSum = new ArrayList<>();
                groupedSum.add(nums[i]);
                group.put(getDigitSum(nums[i]),groupedSum);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry: group.entrySet()) {
            List<Integer> subResult = entry.getValue();
            if (subResult.size() > 1) {
                Collections.sort(subResult);
                int maxSum = subResult.get(subResult.size() - 1) + subResult.get(subResult.size() - 2);
                result.add(maxSum);
            } else {
                result.add(subResult.get(0));
            }
        }
        return result;
    }

    public int getDigitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        MaxGroupSum mgs = new MaxGroupSum();
        int[] nums = new int[]{51, 24, 42, 63, 45, 54, 12, 21, 6, 123};
        List<Integer> result = mgs.maxGroupSum(nums);
        System.out.println(result);
    }
}
