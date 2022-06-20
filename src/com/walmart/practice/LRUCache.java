package com.walmart.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;

//            put(key, vale)
//          /               \
//    if key exist           if key not exist
//        /                     \
// update value                  check capacity
//make key recent use               /         \
//                           has capacity      out of capacity
//                            /                         \
//                       put(key, val)              remove least used key;
//                    make key recent use             put(key, val)


public class LRUCache {
    int cap;
    private LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();

    public LRUCache(int capacity) {
        this.cap = capacity;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        makeRecently(key);
        return cache.get(key);
    }

    public void put(int key, int val) {
        if (cache.containsKey(key)) {
            cache.put(key, val);
            makeRecently(key);
            return;
        }

        if (cache.size() >= this.cap) {
            int oldestKey = cache.keySet().iterator().next();
            cache.remove(oldestKey);
        }
        cache.put(key, val);
    }

    private void makeRecently(int key) {
        int val = cache.get(key);
        cache.remove(key);
        cache.put(key, val);
    }
}
