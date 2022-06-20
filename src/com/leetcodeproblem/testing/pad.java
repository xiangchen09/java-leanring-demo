package com.leetcodeproblem.testing;

import java.util.HashSet;

public class pad {
    public int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i];
        }

        int[] suffix = new int[n];
        suffix[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0 ; i--) {
            suffix[i] = suffix[i + 1] * nums[i];
        }

        int[] result = new int[n];
        result[0] = suffix[1];
        result[n - 1] = prefix[n - 2];
        for (int i = 1; i < n - 1 ; i++) {
            result[i] = prefix[i - 1] * suffix[i + 1];
        }
        return result;
    }

    public int maxSubArray(int[] nums){
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int[] dp = new int[n];
        dp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
        }

        int res = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    public int maxProductArray(int[] nums){
        int n = nums.length;
        if (n == 0) {
            return 0;
        }

        int max_so_far = nums[0];
        int min_so_far = nums[0];
        int result = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            int temp_max = Math.max(nums[i], Math.max(max_so_far * nums[i], min_so_far * nums[i]));
            min_so_far = Math.min(nums[i], Math.min(min_so_far * nums[i], max_so_far * nums[i]));
            max_so_far = temp_max;

            result = Math.max(result, max_so_far);
        }
        return result;
    }


    public int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int left = 0, right = nums.length - 1;
        if (nums[right] > nums[0]) {
            return nums[0];
        }

        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if (nums[mid] - 1 > nums[mid]) {
                return nums[mid];
            }
            if (nums[mid] > nums[0]) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        //if a sorted array is shifted, after taking the middle, always one side will be sorted.
        //Take the recursion acoording the rule
        //edge cases:
        if (nums.length == 1 && nums[0] == target) {
            return nums[0];
        }
        int left = 0, right = nums.length - 1;
        while (right >= left) {
            int mid = left + (right - left) / 2;
            //take the middle and compare with the target, if matches, return;
            if (nums[mid] == target) return mid;
            //if mid is bigger than left, it means left is sorted;
            else if (nums[mid] >= nums[left]) {
                //if [left] < target < [mid] then do the recursion with right = mid - 1;
                if (target >= nums[left] && target <= nums[mid]) {
                    right = mid - 1;
                }
                //else left = mid + 1;
                else {
                    left = mid + 1;
                }
            }
            // if mid is smaller than right, it means right is sorted;
            else {
                //if [mid] < target < [right], then do the recursion with left = mid + 1;
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                }
                //else right  = mid - 1;
                else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
