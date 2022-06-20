package com.codility.test;

public class FrogJump {
    public int solution(int X, int Y, int D) {
        int jumpCount = 0;
        int endLocation = X;
        while (endLocation < Y) {
            jumpCount++;
            endLocation = X +jumpCount * D;
        }
        return jumpCount;
    }
}
