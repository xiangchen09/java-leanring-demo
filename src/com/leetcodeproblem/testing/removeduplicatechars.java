package com.leetcodeproblem.testing;

import java.util.*;


public class removeduplicatechars {

    public Map<Character, Integer> count = new HashMap<>();
    public List<Character> RemoveDuplicateChars(String str){

        // a: 1 b:2
        //
        List<Character> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            count.put(str.charAt(i), count.getOrDefault(str.charAt(i), 1) + 1);
        }
//        for (Map.Entry<Character, Integer>entry: count.entrySet()){
//            result.add(entry.getKey());
            for (Character key: count.keySet()) {
                result.add(key);
        }
        return result;
    }


    public static void main(String[] args) {
        removeduplicatechars ic = new removeduplicatechars();
        String str = "addde";
        List<Character> result = ic.RemoveDuplicateChars(str);
//        System.out.println(result.toString());
//        for (int i = 0; i < result.size(); i++) {
//            System.out.println(result.get(i));
//        }
        result.stream().forEach(c -> {
            System.out.println(c);
        });
    }
}
