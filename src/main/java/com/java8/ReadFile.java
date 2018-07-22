package com.java8;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFile {

    public static void main(String arr[]) {

        String filePath = "/Users/naveentyagi/Desktop/test.txt";
        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            stream.forEachOrdered(System.out::println);
        } catch (Exception e) {
            System.out.println("Excepton Occured:-" + e);
        }
    }
}
