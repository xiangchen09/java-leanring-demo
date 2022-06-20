package com.codility.test;

public class MaximalNetworkRank {
    public int maximalNetworkRank(int n, int[][] roads) {
        boolean[][] connected = new boolean[n][n];
        int[] count = new int[n];
        for (int[] road: roads) {
            count[road[0]]++;
            count[road[1]]++;
            connected[road[0]][road[1]] = true;
            connected[road[1]][road[0]] = true;
        }

        int result = 0;
        for(int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (connected[i][j]) {
                    result = Math.max(result, count[i] + count[j] - 1);
                }
            }
        }
        return result;
    }
}
