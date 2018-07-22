package com.java8;

import java.util.Arrays;

public class IfArrayContainsCertainValue {

    public static void main(String arr[]) {
        String[] names = {"A", "B", "C", "D"};
        boolean flag = Arrays.stream(names).anyMatch("A"::equals);
        System.out.println("Flag: " + flag);
    }
}
