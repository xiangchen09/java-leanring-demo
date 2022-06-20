package com.leetcodeproblem.testing;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestClass {
    public final int value = 4;
    public void doIt() {
        int value = 6;
        Runnable r = new Runnable() {
            public void run(){
                int value1 = 10;
                System.out.println(value1);
            }
        };
        r.run();
    } public static void main(String...args) {
        TestClass m = new TestClass();
        m.doIt();
    }}

