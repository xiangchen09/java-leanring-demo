package com.leetcodeproblem.testing;

public class BinarySearchTemplate {
    public int findPosition(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;

        int left = 0, right  = nums.length - 1;
        //要点1：left + 1 < right;
        while (left + 1 < right) {
            //要点2： left + (right - left) / 2;
            int mid = left + (right - left) / 2;
            //要点3： =, <, > 分开讨论, mid 不+1 也不 -1;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid;
            }
            else {
                right = mid;
            }
        }

        //要点4： 退出循环后，单独处理left和right
        if (nums[left] == target) {
            return left;
        }
        if (nums[right] == target) {
            return right;
        }
        return -1;
    }
}
