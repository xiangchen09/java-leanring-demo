package com.leetcodeproblem.testing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class twosum {
    public static int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        try {
            twosum twoSum = new twosum();
            int[] nums = new int[]{2, 7, 11, 15};
            int target = 9;
            int[] result = twosum.twoSum(nums, target);
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
