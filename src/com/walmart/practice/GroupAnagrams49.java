package com.walmart.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GroupAnagrams49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> codetoGroup = new HashMap<>();
        for (String s: strs) {
            String code = encode(s);
            codetoGroup.putIfAbsent(code, new LinkedList<>());
            codetoGroup.get(code)
                    .add(s);
        }
        List<List<String>> res = new LinkedList<>();
        for (List<String> group: codetoGroup.values()) {
            res.add(group);
        }
        return res;
    }

    public String encode(String s) {
        char[] code = new char[26];
        for (char c: s.toCharArray()) {
            int delta = c - 'a';
            code[delta]++;
        }
        return Arrays.toString(code);
    }
}
