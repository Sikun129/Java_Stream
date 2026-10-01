package com.methods.java_stream.Terminal_Operations.Collect_Operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {

        // Q:- Create a list of numbers greater than 10 from a given list

        List<Integer> numbers = Arrays.asList(5,20,15,17,44,8,3);

      List<Integer> greaterThan10 =  numbers.stream()
                .filter(num -> num >10)
                .collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println(greaterThan10);
    }
}
