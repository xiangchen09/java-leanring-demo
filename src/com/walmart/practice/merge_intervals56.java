package com.walmart.practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class merge_intervals56 {
    public int[][] merge(int[][] intervals) {
        LinkedList<int[]> res = new LinkedList<>();
        Arrays.sort(intervals, (a, b) -> {
            return a[0] - b[0];
        });

        res.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] curr = intervals[i];
            int[] prev = res.getLast();
            if (curr[0] <= prev[1]) {
                prev[1] = Math.max(prev[1], curr[1]);
            }
            else {
                res.add(curr);
            }
        }
        return res.toArray(new int[res.size()][2]);
    }
}
