package com.leetcodeproblem.testing;

import java.util.Arrays;
import java.util.LinkedList;

public class meeting_room252 {
    public boolean canAttendMeetings(int[][] intervals) {
        if (intervals.length == 0) {
            return true;
        }
        if (intervals.length == 1) {
            return true;
        }
        Arrays.sort(intervals, (a, b) -> {
            return a[0] - b[0];
        });

        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] > intervals[i + 1][0]) {
                return false;
            }
        }
        return true;
    }
}
