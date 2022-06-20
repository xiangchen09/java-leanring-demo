package com.codility.test;

//右移K次相当于反转整个数组，再反转前K个数，和后N-K个数
//        n = 7, k = 3
//        Original List                   : 1 2 3 4 5 6 7
//        After reversing all numbers     : 7 6 5 4 3 2 1
//        After reversing first k numbers : 5 6 7 4 3 2 1
//        After revering last n-k numbers : 5 6 7 1 2 3 4 --> Result

import java.util.Arrays;

public class CyclicRotation {
    public int[] rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        return nums;
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] result = cyclicRotation.rotate(nums, k);
        Arrays.stream(result).forEach(System.out::println);
    }
}
