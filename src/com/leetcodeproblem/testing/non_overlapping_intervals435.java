package com.leetcodeproblem.testing;

import java.util.Arrays;
import java.util.LinkedList;

public class non_overlapping_intervals435 {
    public int easeOverlappingIntervals(int[][] intervals) {
        LinkedList<int[]> res = new LinkedList<>();
        Arrays.sort(intervals, (a, b) -> {
            return a[1] - b[1];
        });

        res.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] curr = intervals[i];
            int[] last = res.getLast();
            if (curr[0] < last[1]) {
                continue;
            }
            res.add(curr);
        }
        return intervals.length - res.size();
    }

}
