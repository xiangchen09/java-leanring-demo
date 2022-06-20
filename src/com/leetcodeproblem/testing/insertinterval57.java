package com.leetcodeproblem.testing;

import java.util.LinkedList;

public class insertinterval57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int newStart = newInterval[0], newEnd = newInterval[1];
        int index = 0, n = intervals.length;
        LinkedList<int[]> output = new LinkedList<>();

        while (index < n && newStart > intervals[index][0]) {
            output.add(intervals[index]);
            index++;
        }
        int[] interval = new int[2];
        if (output.isEmpty() || newStart > output.getLast()[1]) {
            output.add(newInterval);
        } else {
            interval = output.removeLast();
            interval[1] = Math.max(interval[1], newEnd);
            output.add(interval);
        }

        while (index < n) {
            interval = intervals[index++];
            int start = interval[0], end = interval[1];
            if (output.getLast()[1] < start) {
                output.add(interval);
            } else {
                interval = output.removeLast();
                interval[1] = Math.max(interval[1], end);
                output.add(interval);
            }
        }
        return output.toArray(new int[output.size()][2]);
    }
}
