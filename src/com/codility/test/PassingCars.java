package com.codility.test;

public class PassingCars {
    public int solution(int[] A) {
        int travelingEast = 0;
        int passingCar = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                travelingEast += 1;
            }
            if (A[i] == 1 && travelingEast > 0) {
                passingCar += travelingEast;
            }
        }
        return passingCar;
    }
}
