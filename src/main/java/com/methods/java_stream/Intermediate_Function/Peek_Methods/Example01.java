package com.methods.java_stream.Intermediate_Function.Peek_Methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example01 {
    public static void main(String[] args) {

        //Q:- Debugging the stream with peek

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

      List<Integer> multiple =  numbers.stream()
                .peek(n -> System.out.println( "Original" +n))
                .map(n -> n * 2)
                .peek(n -> System.out.println("AfterMap" +n))
                .collect(Collectors.toList());

        System.out.println(multiple);
    }
}
