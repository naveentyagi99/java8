package com.java8;

import java.util.stream.Stream;

public class JoinArrays {

    public static void main(String arr[]){
        String[] s1 = {"A", "B", "C", "D", "E", "F"};
        String[] s2 = {"G", "H", "I", "J", "K", "L"};
        String[] s3 = {"M", "N", "O", "P", "Q", "R"};

        String[] mergeArray = Stream.of(s1, s2, s3).flatMap(Stream::of).toArray(String[]::new);
        System.out.println("Merged Array: "+ mergeArray);



        //Convert String to Char Array

        String test = "This is a Test";
        test.chars()
                .mapToObj(x->(char) x)
                .forEach(System.out::println);

    }
}
