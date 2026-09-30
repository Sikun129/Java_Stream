package com.methods.java_stream.Intermediate_Function.Limit_Method;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example01 {
    public static void main(String[] args) {

        //Q:- Get the First 3 elements using limit
        List<Integer> numbers = Arrays.asList(1, 24, 33, 4, 28, 39, 10);

       List<Integer> elements = numbers.stream()
                                       .limit(3)
                                       .collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println(elements);
    }
}
