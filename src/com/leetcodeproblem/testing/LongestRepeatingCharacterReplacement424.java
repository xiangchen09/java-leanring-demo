package com.leetcodeproblem.testing;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement424 {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<>();

        int left = 0, right = 0;
        int maxWindow = 0;
        int maxRepeat = 0;
        while (right < s.length()) {
            Character c = s.charAt(right);
            count.put(c, count.getOrDefault(c, 0) + 1);
            right++;
            maxRepeat = Math.max(maxRepeat, count.get(c));
            while (right - left - maxRepeat > k) {
                Character d = s.charAt(left);
                left++;
                count.put(d, count.get(d) - 1);
            }
            maxWindow = Math.max(maxWindow, right - left);
        }
        return maxWindow;
    }
}
