package com.function.testing;

import java.util.Arrays;
import java.util.List;

public class ParallelStreams {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        listOfNumbers.parallelStream().forEach(number -> {
            System.out.println(number + " " + Thread
                    .currentThread()
                    .getName());
        });
    }
}
