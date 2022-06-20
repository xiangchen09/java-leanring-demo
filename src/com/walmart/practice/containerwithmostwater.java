package com.walmart.practice;

public class containerwithmostwater {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int res = 0;

        while (left < right) {
            int cur_area = Math.min(height[left], height[right]) * (right - left);
            res = Math.max(res, cur_area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }
}
