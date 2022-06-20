package com.codingpad;

import java.util.Hashtable;
import java.util.LinkedHashMap;

public class TestClass {
    public final int value = 4;
    public void doIt() {
        int value = 6;
        value = 100;
        Runnable r = new Runnable() {
            public final int value = 7;
            public void run(){
                int value = 10;
                System.out.println(this.value);
            }

        };

        r.run();
    }

    public static void main(String...args) {
        TestClass m = new TestClass();
        m.doIt();
    }

}
