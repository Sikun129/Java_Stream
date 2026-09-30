package com.methods.java_stream.Intermediate_Function.Map_Methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_Example {
    public static void main(String[] args) {

        // Q:-Multiply each number by 2 using map
        List<Integer> numbers = Arrays.asList(1, 2,  4, 5,  7, 8, 10);

    List<Integer> multiplyBy2 =  numbers.stream()
                .map(x -> x * 2)
                .collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println(multiplyBy2);
    }
}
