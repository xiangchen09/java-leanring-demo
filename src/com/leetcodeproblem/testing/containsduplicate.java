package com.leetcodeproblem.testing;

import java.util.Arrays;

public class containsduplicate {
    public boolean containsDuplicate(int[] nums){
        if (nums == null) {
            return false;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        containsduplicate cd = new containsduplicate();
        int[] nums = new int[]{1, 2, 3, 4};
        Boolean result = cd.containsDuplicate(nums);
        System.out.println(result);
    }
}
