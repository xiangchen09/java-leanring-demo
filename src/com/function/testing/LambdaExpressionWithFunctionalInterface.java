package com.function.testing;

interface Addable {
    int add(int a, int b);
}

interface Sayable {
    String say();
    //String say(String name)
}


public class LambdaExpressionWithFunctionalInterface {
    public static void main(String[] args) {
        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));

        Addable ad2 = (int a, int b) -> (a + b);
        System.out.println((ad2.add(100, 200)));

        Sayable s = () -> {
            return "I have nothing to say";
        };
//        Sayable s = (name) -> {
//            return "Hello, " + name;
//        }
//        System.out.println(s.say("Shawn"));

        System.out.println(s.say());
    }
}
