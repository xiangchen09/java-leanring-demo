package com.leetcodeproblem.testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSumQuestion {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            findTwoSum(nums, i, res);
        }
        return res;
    }

    private void findTwoSum(int[] nums, int index, List<List<Integer>> res) {
        int left = index + 1, right = nums.length - 1;
        int target = -nums[index];

        while (left < right) {
            int twoSum = nums[left] + nums[right];
            if (twoSum < target) {
                left++;
            } else if (twoSum > target) {
                right--;
            } else {
                List<Integer> triple = new ArrayList<>();
                triple.add(nums[index]);
                triple.add(nums[left]);
                triple.add(nums[right]);
                res.add(triple);
                left++;
                right--;
                while (left < right && nums[left] == nums[left] - 1) {
                    left++;
                }
            }
        }
    }

    public static void main(String[] args) {
        threeSumQuestion threeSum = new threeSumQuestion();
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum.threeSum(nums);
        for (List<Integer> list: result) {
            System.out.println(list);
        }
    }
}
