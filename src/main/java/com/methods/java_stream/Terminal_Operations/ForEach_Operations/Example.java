package com.methods.java_stream.Terminal_Operations.ForEach_Operations;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        //@:- Print all names from a list

        List<String> names = Arrays.asList("Rahul" , "Bob", "Charlie", "Tonny");

        names.stream()
                .forEach(System.out::println);

        System.out.println("--------------");
        names.stream()
                .forEach(System.out::println);
    }
}
