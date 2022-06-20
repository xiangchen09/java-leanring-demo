package com.walmart.practice;

import java.util.Arrays;

public class LongestIncreasingSubsequence300 {
    public int lengthOfLIS(int[] nums) {
        //让dp[i] 等于 以nums[i]结尾的最长递增子序列的长度;
        int[] dp = new int[nums.length];

        //让dp的起始状态全为1;
        Arrays.fill(dp, 1);

        //for循环数组中每个数nums[i]以及该数之前的所有元素nums[j], 如果nums[i] > nums[j], 则dp[i] = dp[j] + 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        //for循环构造结束后的dp数组，取最大值;
        int result = 0;
        for (int i = 0; i < dp.length; i++) {
            result = Math.max(result, dp[i]);
        }
        return result;
    }
}
