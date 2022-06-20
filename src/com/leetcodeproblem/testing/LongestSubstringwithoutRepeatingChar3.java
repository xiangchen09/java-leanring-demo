package com.leetcodeproblem.testing;

import java.util.HashMap;

public class LongestSubstringwithoutRepeatingChar3 {

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> count = new HashMap<>();
        int left = 0, right = 0;
        int res = 0;
        while (right < s.length()) {
            Character c = s.charAt(right);
            right++;
            count.put(c, count.getOrDefault(c, 0) + 1);
            while (count.get(c) > 1) {
                Character d = s.charAt(left);
                left++;
                count.put(d, count.get(d) - 1);
            }
            res = Math.max(res, right - left);
        }
        return res;
    }
}
