package com.walmart.practice;

import java.util.Arrays;

public class MergeArrays {
    public int[] mergeArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] res = new int[m + n];
        int p1 = 0,  p2 = 0;

        for (int i = 0; i < m + n; i++) {
            if (p2 >= n || (p1 < m && nums1[p1] < nums2[p2])) {
                res[i] = nums1[p1];
                p1++;
            } else {
                res[i] = nums2[p2];
                p2++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        MergeArrays ma = new MergeArrays();
        int[] nums1 = new int[]{1, 2, 3, 4, 20};
        int[] nums2 = new int[]{2, 5, 6};
        int[] res = ma.mergeArrays(nums1, nums2);
        Arrays.stream(res).forEach(nums -> {
            System.out.println(nums);
        });
    }
}
