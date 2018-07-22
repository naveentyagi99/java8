package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerExample {

    public static void main(String arr[]){
        StringJoiner sj = new StringJoiner("/", "perfix", "suffix");
        sj.add("test1");
        sj.add("test2");
        sj.add("test3");
        System.out.println(sj); // output = perfixtest1/test2/test3suffix


        //Joining a List
        List<String> list = Arrays.asList("A", "B", "C","D");
        String result = String.join(",", list);
        System.out.println(result); //A,B,C,D

        //Collectors Joining

        List<String> nameList = Arrays.asList("Harsh", "Kuldeep", "Saurabh", "Kaushal");
        String nameResult = nameList.stream()
                .filter(x->x.equals("Kaushal"))
                .map(x->x)
                .collect(Collectors.joining(" | "));

        System.out.println(nameResult);



    }
}
