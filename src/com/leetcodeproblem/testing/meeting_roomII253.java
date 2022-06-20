package com.leetcodeproblem.testing;

import java.util.Arrays;

public class meeting_roomII253 {
    public int minMeetingRooms(int[][] intervals) {
        int n = intervals.length;
        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);
        int count = 0;
        int res = 0, pointer_start = 0, pointer_end = 0;

        while (pointer_start < n && pointer_end < n) {
            if (start[pointer_start] < end[pointer_end]) {
                count++;
                pointer_start++;
            } else {
                count--;
                pointer_end++;
            }
            res = Math.max(res, count);
        }
        return res;
    }
}
