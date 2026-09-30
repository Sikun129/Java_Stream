package com.methods.java_stream.Intermediate_Function.Sorted_Method;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example01 {
    public static void main(String[] args) {

        //Q:- Sort numbers in natural order (ascending)
        List<Integer> numbers = Arrays.asList(2,5,13,7,33,8,6,22);
      List<Integer> ascending = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println(ascending);

    }
}
