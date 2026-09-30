package com.methods.java_stream.Intermediate_Function.Filter_Methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Example {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice" , "Sikun", "Charlie", "Rahul","David");

        List<String> namesGreaterThan3 = names.stream()
                .filter(x -> x.length() > 5)
                .collect(Collectors.toList());

        System.out.println(namesGreaterThan3);
        System.out.println(names);

    }
}

